package com.dimas.made1.favorite

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dimas.made1.favorite.databinding.FragmentFavoriteBinding
import com.google.android.material.tabs.TabLayoutMediator

class FavoriteFragment : Fragment() {


    private var _binding: FragmentFavoriteBinding ?= null
    private val binding get() = _binding as FragmentFavoriteBinding
    private var _mediator : TabLayoutMediator?=null
    private val mediator get()= _mediator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val favoriteSectionsPagerAdapter = FavoriteSectionsPagerAdapter(this,binding.tabsFavorite.tabCount)

        binding.viewPagerFavorite.adapter = favoriteSectionsPagerAdapter

        _mediator = TabLayoutMediator(binding.tabsFavorite,binding.viewPagerFavorite){ tab, position ->
            tab.text = tabTitleProvider(requireContext(), position)
        }
        mediator?.attach()

    }

    private fun tabTitleProvider(context: Context, position: Int): String {
        return when (position) {
            0 -> context.getString(R.string.movie)
            1 -> context.getString(R.string.tv)
            else -> throw Exception("Invalid Position")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mediator?.detach()
        _mediator = null
        binding.viewPagerFavorite.adapter = null
        _binding = null
    }
}

