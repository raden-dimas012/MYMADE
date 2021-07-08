package com.dimas.made1.favorite.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dimas.made1.base.BaseNavigationFragment
import com.dimas.made1.core.adapter.MovieTvAdapter
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.favorite.FavoriteFragmentDirections
import com.dimas.made1.favorite.R
import com.dimas.made1.favorite.databinding.FragmentFavoriteMovieTvBinding
import com.dimas.made1.favorite.di.FavoriteModule
import com.dimas.made1.utils.DataState
import com.google.android.material.snackbar.Snackbar
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoriteMovieTvFragment : BaseNavigationFragment() {
    private val viewModel by viewModel<FavoriteMovieTvViewModel>()

    private var _binding: FragmentFavoriteMovieTvBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavoriteMovieTvBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadKoinModules(FavoriteModule.viewModel)
        val content = arguments?.getBoolean(DATA_CONTENT)
        itemTouchHelper.attachToRecyclerView(binding?.rvFavMovieTv)
        favState(DataState.LOADING)
        val movieTvAdapter = MovieTvAdapter()

        if (content == false) {
            viewModel.getFavoriteMovies().observe(viewLifecycleOwner, {
                if (it.isNullOrEmpty()) {
                    favState(DataState.ERROR)
                } else {
                    favState(DataState.SUCCESS)
                }
                movieTvAdapter.setData(it)
            })

            setupRvFavMovie(movieTvAdapter)
        } else {
            viewModel.getFavoriteTv().observe(viewLifecycleOwner, {
                if (it.isNullOrEmpty()) {
                    favState(DataState.ERROR)
                } else {
                    favState(DataState.SUCCESS)
                }
                movieTvAdapter.setData(it)
            })
            setupRvFavTv(movieTvAdapter)
        }
    }

    private fun setupRvFavMovie(movieTvAdapter: MovieTvAdapter) {
        binding.apply {
            with(this?.rvFavMovieTv) {
                this?.layoutManager = LinearLayoutManager(context)
                this?.setHasFixedSize(true)
                this?.adapter = movieTvAdapter
            }
        }
        movieTvAdapter.setOnItemClickCallback(object : MovieTvAdapter.OnItemClickCallback {
            override fun onItemClicked(movieTv: DataDomain) {
                navigateWithAction(
                    FavoriteFragmentDirections.actionFavoriteMovieTvFragmentToNavDetail(
                        "movie", movieTv
                    )
                )
            }
        })
    }


    private fun setupRvFavTv(tvAdapter: MovieTvAdapter) {
        binding.apply {
            with(this?.rvFavMovieTv) {
                this?.layoutManager = LinearLayoutManager(context)
                this?.setHasFixedSize(true)
                this?.adapter = tvAdapter
            }
        }

        tvAdapter.setOnItemClickCallback(object : MovieTvAdapter.OnItemClickCallback {
            override fun onItemClicked(movieTv: DataDomain) {
                navigateWithAction(
                    FavoriteFragmentDirections.actionFavoriteMovieTvFragmentToNavDetail(
                        "tv", movieTv
                    )
                )
            }
        })
    }


    private fun favState(state: DataState) {
        when (state) {
            DataState.LOADING -> {
                loading(true)
                notFound(false)
            }
            DataState.SUCCESS -> {
                loading(false)
                notFound(false)
            }
            DataState.ERROR -> {
                loading(false)
                notFound(true)
            }
        }
    }

    private fun loading(state: Boolean) {
        if (state) {
            binding?.pbFavMovieTv?.visibility = View.VISIBLE
        } else {
            binding?.pbFavMovieTv?.visibility = View.GONE
        }
    }

    private fun notFound(state: Boolean) {
        if (state) {
            val content = arguments?.getBoolean(DATA_CONTENT)
            binding?.notFound?.lottieAnimNotFound?.visibility = View.VISIBLE
            binding?.notFound?.tvNotFound?.visibility = View.VISIBLE
            if (content == false) {
                binding?.notFound?.tvNotFound?.text =
                    resources.getString(R.string.favorite_movie_not_found)
            } else {
                binding?.notFound?.tvNotFound?.text =
                    resources.getString(R.string.favorite_tv_not_found)
            }

        } else {
            binding?.notFound?.lottieAnimNotFound?.visibility = View.GONE
            binding?.notFound?.tvNotFound?.visibility = View.GONE
        }
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder
        ): Int =
            makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)

        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean = true

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            if (view != null) {
                val content = arguments?.getBoolean(DATA_CONTENT)
                if (content == false) {
                    val movieAdapter = MovieTvAdapter()
                    val swipedPosition = viewHolder.bindingAdapterPosition
                    val movie = movieAdapter.getSwipedData(swipedPosition)
                    var state = movie.isFavorite
                    movie.let { viewModel.setFavoriteMovie(it, !state) }
                    state = !state
                    val snackBar = Snackbar.make(
                        view as View,
                        resources.getString(R.string.cancel_delete_fav_movie),
                        Snackbar.LENGTH_LONG
                    )
                    snackBar.setAction(R.string.oke) { _ ->
                        movie.let { viewModel.setFavoriteMovie(it, !state) }
                    }
                    snackBar.show()
                } else {
                    val tvAdapter = MovieTvAdapter()
                    val swipedPosition = viewHolder.bindingAdapterPosition
                    val tv = tvAdapter.getSwipedData(swipedPosition)
                    var state = tv.isFavorite
                    tv.let { viewModel.setFavoriteTv(it, !state) }
                    state = !state
                    val snackBar = Snackbar.make(
                        view as View,
                        resources.getString(R.string.cancel_delete_fav_tv),
                        Snackbar.LENGTH_LONG
                    )
                    snackBar.setAction(R.string.oke) { _ ->
                        tv.let { viewModel.setFavoriteTv(it, !state) }
                    }
                    snackBar.show()
                }

            }
        }
    })

    override fun onDestroyView() {
        super.onDestroyView()
        binding?.rvFavMovieTv?.adapter = null
        itemTouchHelper.attachToRecyclerView(null)
        _binding = null
    }


    companion object {
        const val DATA_CONTENT = "content"
        fun newInstance(isTv: Boolean): FavoriteMovieTvFragment {
            return FavoriteMovieTvFragment().apply {
                arguments = Bundle().apply {
                    putBoolean(DATA_CONTENT, isTv)
                }
            }
        }
    }


}