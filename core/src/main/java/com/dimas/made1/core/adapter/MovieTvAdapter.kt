package com.dimas.made1.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dimas.made1.core.BuildConfig
import com.dimas.made1.core.R
import com.dimas.made1.core.databinding.ItemListBinding
import com.dimas.made1.core.domain.model.DataDomain

class MovieTvAdapter : RecyclerView.Adapter<MovieTvAdapter.MovieViewHolder>() {

    private var listMovie = ArrayList<DataDomain>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setData(newListMovie: List<DataDomain>?) {
        if (newListMovie == null) return
        listMovie.clear()
        listMovie.addAll(newListMovie)
        notifyDataSetChanged()
    }


    inner class MovieViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movieTv: DataDomain) {
            with(binding) {
                Glide.with(itemView.context)
                    .load("${BuildConfig.URL_IMAGE}${movieTv.posterPath}")
                    .apply {
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    }.into(imgItems)

                tvTitle.text = movieTv.name
                tvDate.text = movieTv.releaseDate
                tvRating.text = movieTv.voteAverage.toString()

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(movieTv)
                }
            }
        }
    }

    fun getSwipedData(swipedPosition: Int): DataDomain = listMovie[swipedPosition]

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    interface OnItemClickCallback {
        fun onItemClicked(movieTv: DataDomain)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemListBinding =
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemListBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.list_anim)
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size
}