package com.dimas.made1.explore

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dimas.made1.explore.content.MovieTvFragment
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview


@FlowPreview
@ExperimentalCoroutinesApi
class SearchSectionsPagerAdapter(fragment: Fragment, private val numberOfTab: Int) :
    FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = numberOfTab

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MovieTvFragment.newInstance(isTv = false)
            1 -> MovieTvFragment.newInstance(isTv = true)

            else -> throw Exception("Position: $position is not available!")
        }
    }

}