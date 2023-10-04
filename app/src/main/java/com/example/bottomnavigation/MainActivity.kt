package com.example.bottomnavigation


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavOptions
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(), Communicator{
    private lateinit var binding: ActivityMainBinding
    lateinit var data1:TextView
    lateinit var Submitbtn:Button
    private lateinit var navController: NavController

    private var currentButtonText = ""

    private lateinit var bottomNavigationView: BottomNavigationView

    private fun navigateToTab(itemId : Int, args:  Bundle? = null) {
      val navOptions =  NavOptions.Builder()
            .setPopUpTo(itemId , false)
            .build()
        navController.navigate(itemId ,  args , navOptions)
    }

    private val navigationListener = NavigationBarView.OnItemSelectedListener {
        when(it.itemId)
        {
            R.id.musicFragment2 -> {
                val args = Bundle()
                //navController.popBackStack()
                args.putString("data" , currentButtonText)
                navigateToTab(R.id.musicFragment2 , args)

            }
            R.id.favFragment2 -> {
                navigateToTab(R.id.favFragment2  )

            }
            R.id.newsFragment3 -> {
                navigateToTab(R.id.newsFragment3  )

            }
            R.id.placesFragment2 -> {
                navigateToTab(R.id.placesFragment2 )

            }
        }
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_container) as NavHost
        navController = navHostFragment.navController
         bottomNavigationView=findViewById<BottomNavigationView>(R.id.BottomNavigationView)

       bottomNavigationView.setOnItemSelectedListener(navigationListener)

    }



    override fun passData(editTextData: String) {
        currentButtonText = editTextData
        bottomNavigationView.selectedItemId = R.id.musicFragment2;
    }
    }