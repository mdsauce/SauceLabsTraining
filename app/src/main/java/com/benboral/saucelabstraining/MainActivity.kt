package com.benboral.saucelabstraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this::class.simpleName, "onCreate  - ${lifecycle.currentState.name}")
        setContentView(R.layout.activity_main)

        val labelText = resources.getString(R.string.text_hello_world)
        Log.d(this::class.simpleName, "Setting label to $labelText")
        findViewById<TextView>(R.id.main_TextView).text = labelText
        findViewById<Button>(R.id.button_first).setOnClickListener {
            Log.d(TAG, "logClick: CLICK ME! closure")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "onStart - ${lifecycle.currentState.name}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.simpleName, "onResume - ${lifecycle.currentState.name}")
    }
    override fun onPause() {
        super.onPause()
        Log.d(this::class.simpleName, "onPause - ${lifecycle.currentState.name}")
    }
    override fun onStop() {
        super.onStop()
        Log.d(this::class.simpleName, "onStop - ${lifecycle.currentState.name}")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.simpleName, "onDestroy - ${lifecycle.currentState.name}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(this::class.simpleName, "onSaveInstanceState - ${lifecycle.currentState.name}")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(this::class.simpleName, "onRestoreInstanceState - ${lifecycle.currentState.name}")
    }
}