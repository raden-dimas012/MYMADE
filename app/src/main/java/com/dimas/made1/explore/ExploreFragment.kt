package com.dimas.made1.explore

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dimas.made1.R
import com.dimas.made1.databinding.FragmentExploreBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@FlowPreview
@ExperimentalCoroutinesApi
class ExploreFragment : Fragment() {

    private var _binding : FragmentExploreBinding ?= null
    private val binding get() = _binding as FragmentExploreBinding
    private var _mediator : TabLayoutMediator?=null
    private val mediator get() = _mediator


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploreBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            setupView()
    }

    private fun setupView() {

        val searchSectionsPagerAdapter = SearchSectionsPagerAdapter(this, binding.tabsExplore.tabCount)

        binding.viewPagerExplore.adapter = searchSectionsPagerAdapter

        _mediator = TabLayoutMediator(binding.tabsExplore, binding.viewPagerExplore) { tab, position ->
            tab.text = tabTitleProvider(requireContext(), position)
        }
        mediator?.attach()
    }

    private fun tabTitleProvider(context: Context, position: Int): String {
        return when (position) {
            0 -> context.getString(R.string.tab_position_0)
            1 -> context.getString(R.string.tab_position_1)
            else -> throw Exception(resources.getString(R.string.invalid_position))
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        mediator?.detach()
        _mediator = null
        binding.viewPagerExplore.adapter = null
        _binding = null
    }


}