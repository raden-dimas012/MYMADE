package com.dimas.made1.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dimas.made1.core.BuildConfig
import com.dimas.made1.core.R
import com.dimas.made1.core.databinding.ItemContentBinding
import com.dimas.made1.core.domain.model.DataDomain

class ContentMovieAdapter : RecyclerView.Adapter<ContentMovieAdapter.ContentMovieViewHolder>() {

    private var listMovie = ArrayList<DataDomain>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setData(newListMovie: List<DataDomain>?) {
        if (newListMovie == null) return
        listMovie.clear()
        listMovie.addAll(newListMovie)
        notifyDataSetChanged()
    }

    inner class ContentMovieViewHolder(private val binding: ItemContentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: DataDomain) {
            with(binding) {
                Glide.with(itemView.context)
                    .load("${BuildConfig.URL_IMAGE}${movie.posterPath}")
                    .apply {
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    }.into(ivContent)

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(movie)
                }
            }
        }

    }


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    interface OnItemClickCallback {
        fun onItemClicked(movie: DataDomain)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentMovieViewHolder {
        val itemContentBinding =
            ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentMovieViewHolder(itemContentBinding)
    }

    override fun onBindViewHolder(holder: ContentMovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size
}