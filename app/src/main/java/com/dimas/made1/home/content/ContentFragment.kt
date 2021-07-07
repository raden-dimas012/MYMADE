package com.dimas.made1.home.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.dimas.made1.R
import com.dimas.made1.core.adapter.ContentMovieAdapter
import com.dimas.made1.core.adapter.ContentTvAdapter
import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.utils.Sorting
import com.dimas.made1.databinding.FragmentContentBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel


class ContentFragment : Fragment() {

    private var _binding: FragmentContentBinding? = null
    private val binding get() = _binding
    private lateinit var movieAdapter: ContentMovieAdapter
    private lateinit var tvAdapter: ContentTvAdapter
    private val viewModel by viewModel<ContentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            movieAdapter = ContentMovieAdapter()
            tvAdapter = ContentTvAdapter()

            viewLifecycleOwner.lifecycleScope.launch {
                delay(500)
                viewModel.getMovies(Sorting.DEFAULT)
                    .observe(viewLifecycleOwner, contentMovieObserver)
                viewModel.getTv(Sorting.DEFAULT).observe(viewLifecycleOwner, contentTvObserver)
            }
            setRecyclerView()
        }
    }

    private fun setRecyclerView() {
        binding.apply {
            with(this?.rvMovieTrending) {
                this?.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                this?.setHasFixedSize(true)
                this?.adapter = movieAdapter
            }
            with(this?.rvTvTrending) {
                this?.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                this?.setHasFixedSize(true)
                this?.adapter = tvAdapter
            }
        }

        movieAdapter.setOnItemClickCallback(object : ContentMovieAdapter.OnItemClickCallback {
            override fun onItemClicked(movie: DataDomain) {
                val action = ContentFragmentDirections
                    .actionNavContentToDetailFragment(
                        "movie", movie
                    )
                findNavController().navigate(action)
            }
        })
        tvAdapter.setOnItemClickCallback(object : ContentTvAdapter.OnItemClickCallback {
            override fun onItemClicked(tv: DataDomain) {
                val action = ContentFragmentDirections
                    .actionNavContentToDetailFragment(
                        "tv", tv
                    )
                findNavController().navigate(action)

            }
        })
    }

    private val contentMovieObserver = Observer<Resource<List<DataDomain>>> { listMovies ->
        if (listMovies != null) {
            when (listMovies) {
                is Resource.Loading -> {
                    shimmer(true)
                }
                is Resource.Success -> {
                    shimmer(false)
                    movieAdapter.setData(listMovies.data)
                }
                is Resource.Error -> {
                    shimmer(false)
                    Toast.makeText(
                        context,
                        resources.getString(R.string.failed_load_movie),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private val contentTvObserver = Observer<Resource<List<DataDomain>>> { listTv ->
        if (listTv != null) {
            when (listTv) {
                is Resource.Loading -> shimmer(true)
                is Resource.Success -> {
                    shimmer(false)
                    tvAdapter.setData(listTv.data)
                }
                is Resource.Error -> {
                    shimmer(false)
                    Toast.makeText(
                        context,
                        resources.getString(R.string.failed_load_tv),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun shimmer(state: Boolean) {
        if (state) {
            binding?.shimmerContentMovie?.startShimmer()
            binding?.shimmerContentTv?.startShimmer()
            binding?.rvMovieTrending?.visibility = View.GONE
            binding?.rvTvTrending?.visibility = View.GONE
        } else {
            binding?.shimmerContentMovie?.stopShimmer()
            binding?.shimmerContentTv?.stopShimmer()
            binding?.shimmerContentMovie?.visibility = View.GONE
            binding?.shimmerContentTv?.visibility = View.GONE
            binding?.rvMovieTrending?.visibility = View.VISIBLE
            binding?.rvTvTrending?.visibility = View.VISIBLE
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding?.rvTvTrending?.adapter = null
        binding?.rvMovieTrending?.adapter = null
        _binding = null
    }


}