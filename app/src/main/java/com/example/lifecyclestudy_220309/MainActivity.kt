package com.example.lifecyclestudy_220309

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LifeCycle" , "[Main] onCreate()")
        btnDetail.setOnClickListener {
            val detailIntent = Intent(this, DetailActivity :: class.java)
            startActivity(detailIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle" , "[Main] onStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle" , "[Main] onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle" , "[Main] onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle" , "[Main] onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle" , "[Main] onDestroy()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle" , "[Main] onRestart()")

    }
}