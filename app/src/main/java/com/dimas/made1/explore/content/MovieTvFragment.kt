package com.dimas.made1.explore.content

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dimas.made1.R
import com.dimas.made1.base.BaseNavigationFragment
import com.dimas.made1.core.adapter.MovieAdapter
import com.dimas.made1.core.adapter.TvAdapter
import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.utils.Sorting
import com.dimas.made1.databinding.FragmentMovieTvBinding
import com.dimas.made1.explore.ExploreFragmentDirections
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

@FlowPreview
@ExperimentalCoroutinesApi
class MovieTvFragment : BaseNavigationFragment() {

    private val viewModel by viewModel<MovieTvViewModel>()

    private var _binding: FragmentMovieTvBinding? = null
    private val binding get() = _binding
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var tvAdapter: TvAdapter
    private var _searchView: SearchView? = null
    private val searchView get() = _searchView
    private var clicked = false


    private val rotateOpen: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.rotate_open_anim
        )
    }
    private val rotateClose: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.rotate_close_anim
        )
    }
    private val fromBottom: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.from_buttom_anim
        )
    }
    private val toBottom: Animation by lazy {
        AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.to_bottom_anim
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMovieTvBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvAdapter = TvAdapter()
        movieAdapter = MovieAdapter()
        val content = arguments?.getBoolean(DATA_CONTENT)

        if (content == false) {
            viewModel.movieResult.observe(viewLifecycleOwner, {
                if (searchView?.query.toString() == "") {
                    binding?.notFound?.root?.visibility = View.GONE
                } else {
                    if (it.isNullOrEmpty()) {
                        binding?.notFound?.root?.visibility = View.VISIBLE
                        binding?.notFound?.tvNotFound?.text =
                            resources.getString(R.string.movie_not_found)
                    } else {
                        binding?.notFound?.root?.visibility = View.GONE
                    }
                    movieAdapter.setData(it)
                }
            })
            setUpViewModelMovie()
            setUpRvMovie()
            setMovieSorting()
        } else {
            viewModel.tvResult.observe(viewLifecycleOwner, {
                if (searchView?.query.toString() == "") {
                    binding?.notFound?.root?.visibility = View.GONE
                } else {
                    if (it.isNullOrEmpty()) {
                        binding?.notFound?.root?.visibility = View.VISIBLE
                        binding?.notFound?.tvNotFound?.text =
                            resources.getString(R.string.movie_not_found)
                    } else {
                        binding?.notFound?.root?.visibility = View.GONE
                    }
                    tvAdapter.setData(it)
                }
            })

            setUpViewModelTv()
            setUpRvTv()
            setTvSorting()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.searching_menu, menu)
        val searchManager = activity?.getSystemService(Context.SEARCH_SERVICE) as SearchManager
        _searchView = menu.findItem(R.id.search_menu).actionView as SearchView
        searchView?.setSearchableInfo(searchManager.getSearchableInfo(activity?.componentName))
        val content = arguments?.getBoolean(DATA_CONTENT)
        if (content == false) {
            searchView?.queryHint = resources.getString(R.string.search_movie)
            searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

                override fun onQueryTextSubmit(newText: String): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    newText.let {
                        if (newText == "" || newText.isEmpty()) {
                            setUpViewModelMovie()
                        } else {
                            viewModel.setSearchQuery(it)
                        }
                    }
                    return true
                }
            })
        } else {
            searchView?.queryHint = resources.getString(R.string.search_tv)
            searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

                override fun onQueryTextSubmit(newText: String): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    newText.let {
                        if (newText == "" || newText.isEmpty()) {
                            setUpViewModelTv()
                        } else {
                            viewModel.setSearchQuery(it)
                        }
                    }
                    return true
                }
            })
        }

    }

    private fun setUpViewModelMovie() {
        viewLifecycleOwner.lifecycleScope.launch {
            delay(500)
            viewModel.getMovies(Sorting.DEFAULT).observe(viewLifecycleOwner, movieObserver)
        }
    }

    private fun setUpViewModelTv() {
        viewLifecycleOwner.lifecycleScope.launch {
            delay(500)
            viewModel.getTv(Sorting.DEFAULT).observe(viewLifecycleOwner, tvObserver)
        }

    }


    private fun setUpRvTv() {
        binding.apply {
            with(this?.rvMovieTv) {
                this?.layoutManager = LinearLayoutManager(context)
                this?.setHasFixedSize(true)
                this?.adapter = tvAdapter
            }
        }

        tvAdapter.setOnItemClickCallback(object : TvAdapter.OnItemClickCallback {
            override fun onItemClicked(tv: DataDomain) {
                navigateWithAction(
                    ExploreFragmentDirections.actionExploreFragmentToNavDetail(
                        "tv", tv
                    )
                )
            }
        })
    }


    private fun setUpRvMovie() {
        binding.apply {
            with(this?.rvMovieTv) {
                this?.layoutManager = LinearLayoutManager(context)
                this?.setHasFixedSize(true)
                this?.adapter = movieAdapter
            }
        }
        movieAdapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
            override fun onItemClicked(movie: DataDomain) {
                navigateWithAction(
                    ExploreFragmentDirections.actionExploreFragmentToNavDetail(
                        "movie", movie
                    )
                )
            }
        })
    }

    private fun setMovieSorting() {
        binding?.fabSort?.setOnClickListener {
            setupSorting()
        }

        binding?.fabSortId?.setOnClickListener {
            viewModel.getMovies(Sorting.DEFAULT).observe(viewLifecycleOwner, movieObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_movie_by_random),
                Toast.LENGTH_SHORT
            ).show()
        }

        binding?.fabSortVoting?.setOnClickListener {
            viewModel.getMovies(Sorting.VOTING).observe(viewLifecycleOwner, movieObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_movie_by_voting),
                Toast.LENGTH_SHORT
            ).show()
        }

        binding?.fabSortRating?.setOnClickListener {
            viewModel.getMovies(Sorting.BEST_RATING).observe(viewLifecycleOwner, movieObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_movie_by_rating),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setTvSorting() {
        binding?.fabSort?.setOnClickListener {
            setupSorting()
        }
        binding?.fabSortId?.setOnClickListener {
            viewModel.getTv(Sorting.DEFAULT).observe(viewLifecycleOwner, tvObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_tv_by_random),
                Toast.LENGTH_SHORT
            ).show()
        }
        binding?.fabSortVoting?.setOnClickListener {
            viewModel.getTv(Sorting.VOTING).observe(viewLifecycleOwner, tvObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_tv_by_voting),
                Toast.LENGTH_SHORT
            ).show()
        }
        binding?.fabSortRating?.setOnClickListener {
            viewModel.getTv(Sorting.BEST_RATING).observe(viewLifecycleOwner, tvObserver)
            Toast.makeText(
                requireContext(),
                resources.getString(R.string.sort_tv_by_rating),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setupSorting() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setVisibility(clicked: Boolean) {
        if (!clicked) {
            binding?.fabSortId?.visibility = View.VISIBLE
            binding?.fabSortRating?.visibility = View.VISIBLE
            binding?.fabSortVoting?.visibility = View.VISIBLE
            binding?.fabSortId?.isClickable = true
            binding?.fabSortVoting?.isClickable = true
            binding?.fabSortRating?.isClickable = true
        } else {
            binding?.fabSortId?.visibility = View.INVISIBLE
            binding?.fabSortRating?.visibility = View.INVISIBLE
            binding?.fabSortVoting?.visibility = View.INVISIBLE
            binding?.fabSortId?.isClickable = false
            binding?.fabSortVoting?.isClickable = false
            binding?.fabSortRating?.isClickable = false
        }
    }


    private fun setAnimation(clicked: Boolean) {
        if (!clicked) {
            binding?.fabSortId?.startAnimation(fromBottom)
            binding?.fabSortVoting?.startAnimation(fromBottom)
            binding?.fabSortRating?.startAnimation(fromBottom)
            binding?.fabSort?.startAnimation(rotateOpen)
        } else {
            binding?.fabSortId?.startAnimation(toBottom)
            binding?.fabSortVoting?.startAnimation(toBottom)
            binding?.fabSortRating?.startAnimation(toBottom)
            binding?.fabSort?.startAnimation(rotateClose)
        }

    }

    private val movieObserver = Observer<Resource<List<DataDomain>>> { listMovies ->
        if (listMovies != null) {
            when (listMovies) {
                is Resource.Loading -> {
                    shimmer(true)
                    binding?.notFound?.root?.visibility = View.GONE
                }
                is Resource.Success -> {
                    shimmer(false)
                    binding?.notFound?.root?.visibility = View.GONE
                    movieAdapter.setData(listMovies.data)
                }
                is Resource.Error -> {
                    shimmer(false)
                    binding?.notFound?.root?.visibility = View.VISIBLE
                    binding?.notFound?.tvNotFound?.text =
                        resources.getString(R.string.movie_not_found)
                }
            }
        }
    }

    private val tvObserver = Observer<Resource<List<DataDomain>>> { listTv ->
        if (listTv != null) {
            when (listTv) {
                is Resource.Loading -> {
                    shimmer(true)
                    binding?.notFound?.root?.visibility = View.GONE
                }
                is Resource.Success -> {
                    shimmer(false)
                    binding?.notFound?.root?.visibility = View.GONE
                    tvAdapter.setData(listTv.data)
                }
                is Resource.Error -> {
                    shimmer(false)
                    binding?.notFound?.root?.visibility = View.VISIBLE
                    binding?.notFound?.tvNotFound?.text = resources.getString(R.string.tv_not_found)
                }
            }
        }
    }


    private fun shimmer(state: Boolean) {
        if (state) {
            binding?.shimmerMovieTv?.startShimmer()
            binding?.rvMovieTv?.visibility = View.GONE
        } else {
            binding?.shimmerMovieTv?.stopShimmer()
            binding?.shimmerMovieTv?.visibility = View.GONE
            binding?.rvMovieTv?.visibility = View.VISIBLE
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        searchView?.setOnQueryTextListener(null)
        _searchView = null
        binding?.rvMovieTv?.adapter = null
        _binding = null
    }

    companion object {
        const val DATA_CONTENT = "content"
        fun newInstance(isTv: Boolean): MovieTvFragment {
            return MovieTvFragment().apply {
                arguments = Bundle().apply {
                    putBoolean(DATA_CONTENT, isTv)
                }
            }
        }
    }


}