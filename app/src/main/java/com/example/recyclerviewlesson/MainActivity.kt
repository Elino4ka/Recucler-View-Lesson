package com.example.recyclerviewlesson

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.RecyclerViewLesson.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity onCreate: ")
        setContentView(R.layout.activity_main)
        val bnvMain = findViewById<BottomNavigationView>(R.id.bnvMain)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.flContainer, DishesFragment())
            .commit()

    }
}