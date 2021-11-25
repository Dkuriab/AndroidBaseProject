package com.baseproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.baseproject.R
import com.baseproject.databinding.ActivityMainBinding
import com.fragments.setupWithNavController

class MainActivity : AppCompatActivity() {
    private var currentNavController: LiveData<NavController>? = null
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
//        val bottomNavigationView = findViewById(R.id.bottom_navigation)

        val navGraphIds = listOf(
            R.navigation.first,
            R.navigation.second
        )
        val controller = binding.bottomNavigation.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.fragment_place,
            intent = intent
        )
        currentNavController = controller
    }
}