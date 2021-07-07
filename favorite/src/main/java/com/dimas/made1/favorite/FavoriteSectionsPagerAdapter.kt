package com.dimas.made1.favorite

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dimas.made1.favorite.content.FavoriteMovieTvFragment


class FavoriteSectionsPagerAdapter(fragment: Fragment, private val numberOfTab: Int) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = numberOfTab

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FavoriteMovieTvFragment.newInstance(isTv = false)
            1 -> FavoriteMovieTvFragment.newInstance(isTv = true)
            else -> throw Exception("Position: $position is not available!")
        }
    }
}