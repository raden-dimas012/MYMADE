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


class ContentTvAdapter : RecyclerView.Adapter<ContentTvAdapter.ContentTvViewHolder>() {

    private var listTv = ArrayList<DataDomain>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setData(newListTv: List<DataDomain>?) {
        if (newListTv == null) return
        listTv.clear()
        listTv.addAll(newListTv)
        notifyDataSetChanged()
    }

    inner class ContentTvViewHolder(private val binding: ItemContentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: DataDomain) {
            with(binding) {
                Glide.with(itemView.context)
                    .load("${BuildConfig.URL_IMAGE}${tv.posterPath}")
                    .apply {
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    }.into(ivContent)

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(tv)
                }
            }
        }
    }


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    interface OnItemClickCallback {
        fun onItemClicked(tv: DataDomain)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentTvViewHolder {
        val itemContentBinding =
            ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentTvViewHolder(itemContentBinding)
    }

    override fun onBindViewHolder(holder: ContentTvViewHolder, position: Int) {
        val tv = listTv[position]

        holder.bind(tv)
    }

    override fun getItemCount(): Int = listTv.size
}