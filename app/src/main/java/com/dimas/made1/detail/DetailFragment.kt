package com.dimas.made1.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dimas.made1.BuildConfig
import com.dimas.made1.R
import com.dimas.made1.base.BaseNavigationFragment
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.databinding.FragmentDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class DetailFragment : BaseNavigationFragment() {
    private val args by navArgs<DetailFragmentArgs>()

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding
    private val contentBinding get() = _binding?.detail
    private val viewModel by viewModel<DetailViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.content == resources.getString(R.string.args_movie)) {
            showDetailMovie(args.detailData)
        } else {
            showDetailTv(args.detailData)
        }
    }


    private fun showDetailTv(detailTv: DataDomain?) {
        contentBinding.let {
            it?.ivDetail?.let { image ->
                Glide.with(this)
                    .load("${BuildConfig.URL_IMAGE}${detailTv?.posterPath}")
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    ).into(image)
            }
            it?.tvTitle?.text = detailTv?.name
            it?.tvDate?.text = detailTv?.releaseDate
            it?.tvOverview?.text = detailTv?.overview
            it?.tvRating?.text = detailTv?.voteAverage.toString()
            it?.tvVote?.text = detailTv?.voteCount.toString()
            it?.tvPopularity?.text = detailTv?.popularity.toString()

            //coba rubah di bagian ini biar lebih singkat
            if (detailTv?.isFavorite != null) {
                var statusFavorite = detailTv.isFavorite
                setStatusFavorite(statusFavorite)
                binding?.fabFav?.setOnClickListener {
                    statusFavorite = !statusFavorite
                    if (statusFavorite) {
                        Toast.makeText(
                            requireContext(),
                            resources.getString(R.string.success_added_to_favorite),
                            Toast.LENGTH_SHORT
                        ).show()
                        viewModel.setFavoriteTv(detailTv, statusFavorite)
                        setStatusFavorite(statusFavorite)
                    } else {
                        Toast.makeText(
                            requireContext(),
                            resources.getString(R.string.success_removed_from_favorite),
                            Toast.LENGTH_SHORT
                        ).show()
                        viewModel.setFavoriteTv(detailTv, statusFavorite)
                        setStatusFavorite(statusFavorite)
                    }
                }
            }

        }
    }

    private fun showDetailMovie(detailMovie: DataDomain?) {
        contentBinding.let {
            it?.ivDetail?.let { image ->
                Glide.with(this)
                    .load("${BuildConfig.URL_IMAGE}${detailMovie?.posterPath}")
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_load)
                            .error(R.drawable.ic_broken_image)
                    ).into(image)
            }
            it?.tvTitle?.text = detailMovie?.name
            it?.tvDate?.text = detailMovie?.releaseDate
            it?.tvOverview?.text = detailMovie?.overview
            it?.tvRating?.text = detailMovie?.voteAverage.toString()
            it?.tvVote?.text = detailMovie?.voteCount.toString()
            it?.tvPopularity?.text = detailMovie?.popularity.toString()


            if (detailMovie?.isFavorite != null) {
                var statusFavorite = detailMovie.isFavorite
                setStatusFavorite(statusFavorite)
                binding?.fabFav?.setOnClickListener {
                    statusFavorite = !statusFavorite
                    if (statusFavorite) {
                        Toast.makeText(
                            requireContext(),
                            resources.getString(R.string.success_added_to_favorite),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        viewModel.setFavoriteMovie(detailMovie, statusFavorite)
                        setStatusFavorite(statusFavorite)
                    } else {
                        Toast.makeText(
                            requireContext(),
                            resources.getString(R.string.success_removed_from_favorite),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        viewModel.setFavoriteMovie(detailMovie, statusFavorite)
                        setStatusFavorite(statusFavorite)
                    }
                }
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean?) {
        if (statusFavorite == true) {
            binding?.fabFav?.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.ic_fav
                )
            )
        } else {
            binding?.fabFav?.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.ic_not_fav
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}