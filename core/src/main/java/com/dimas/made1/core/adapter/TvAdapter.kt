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


class TvAdapter : RecyclerView.Adapter<TvAdapter.TvViewHolder>() {
    private var listTv = ArrayList<DataDomain>()
    private lateinit var onItemClickCallback: OnItemClickCallback


    fun setData(newListTv: List<DataDomain>?) {
        if (newListTv == null) return
        listTv.clear()
        listTv.addAll(newListTv)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val itemListBinding =
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(itemListBinding)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        val tv = listTv[position]
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.list_anim)
        holder.bind(tv)

    }

    inner class TvViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: DataDomain) {
            with(binding) {
                Glide.with(itemView.context)
                    .load("${BuildConfig.URL_IMAGE}${tv.posterPath}")
                    .apply {
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    }.into(imgItems)

                tvTitle.text = tv.name
                tvDate.text = tv.releaseDate
                tvRating.text = tv.voteAverage.toString()

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(tv)
                }
            }
        }
    }

    fun getSwipedData(swipedPosition: Int): DataDomain = listTv[swipedPosition]


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(tv: DataDomain)
    }

    override fun getItemCount(): Int = listTv.size
}