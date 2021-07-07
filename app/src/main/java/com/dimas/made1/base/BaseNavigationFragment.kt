package com.dimas.made1.base

import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.dimas.made1.utils.popBackStackAllInstances

open class BaseNavigationFragment : Fragment() {
    private var isNavigated = false

    fun navigateWithAction(action: NavDirections) {
        isNavigated = true
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (!isNavigated)
            requireActivity().onBackPressedDispatcher.addCallback(this) {
                val navController = findNavController()
                if (navController.currentBackStackEntry?.destination?.id != null) {
                    findNavController().popBackStackAllInstances(
                        navController.currentBackStackEntry?.destination?.id!!,
                        true
                    )
                } else
                    navController.popBackStack()
            }
    }
}