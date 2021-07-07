package com.dimas.made1.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.dimas.made1.R
import com.dimas.made1.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.findNavController()


        binding?.apply {
            navBottom.setupWithNavController(navController)
            navBottom.setOnNavigationItemReselectedListener {
                Log.d("Reselect", "Block Reselect Item")
            }
        }


        appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.nav_content,
                R.id.nav_explore,
                R.id.nav_favorite
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)


        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.nav_splash -> {
                    binding?.navBottom?.visibility = View.GONE
                    supportActionBar?.hide()
                }
                R.id.nav_detail -> {
                    binding?.navBottom?.visibility = View.GONE
                    supportActionBar?.show()
                }
                else -> {
                    binding?.navBottom?.visibility = View.VISIBLE
                    supportActionBar?.show()
                }
            }
        }
        binding?.navBottom?.setOnClickListener {
            when (navController.currentDestination?.id){
                R.id.nav_explore,R.id.nav_favorite,R.id.nav_detail -> {
                    if(onBackPressedDispatcher.hasEnabledCallbacks()){
                        onBackPressedDispatcher.onBackPressed()
                    } else navController.navigateUp()
                }
                else -> navController.navigateUp()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}