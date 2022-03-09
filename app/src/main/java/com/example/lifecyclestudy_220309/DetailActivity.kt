package com.example.lifecyclestudy_220309

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d("LifeCycle", "[Detail] onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "[Detail] onStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "[Detail] onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "[Detail] onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "[Detail] onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "[Detail] onDestroy()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "[Detail] onRestart()")

    }
}