package com.dimas.made1.splashscreen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.dimas.made1.R

public class SplashScreenFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashScreenFragmentToNavContent(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreenFragment_to_nav_content)
  }
}
