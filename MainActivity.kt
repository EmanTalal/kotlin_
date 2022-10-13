package com.example.fisrtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("************ Create")
    }
    override fun onStart() {
        super.onStart()
        println("******** start")
    }

    override fun onResume() {
        super.onResume()
        println("******** resume")
    }

    override fun onPause() {
        super.onPause()
        println("******** pause")
    }
    override fun onStop() {
        super.onStop()
        println("******** stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("******** destroy")
    }
}
