package com.dimas.made1.utils

import androidx.navigation.NavController

fun NavController.popBackStackAllInstances(destination: Int, inclusive: Boolean): Boolean {
    var popped: Boolean
    while (true) {
        popped = popBackStack(destination, inclusive)
        if (!popped) {
            break
        }
    }
    return popped
}