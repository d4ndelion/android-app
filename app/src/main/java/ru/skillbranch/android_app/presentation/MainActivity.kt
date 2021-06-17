package ru.skillbranch.android_app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import ru.skillbranch.android_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val navHostFragment = supportFragmentManager.findFragmentById(R.layout.activity_main) as NavHostFragment
        val navController = navHostFragment.navController*/
    }
}