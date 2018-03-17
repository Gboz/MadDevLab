package com.github.gboz.maddevlab

import android.content.Intent
import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.util.Log

import com.github.gboz.maddevlab.trials.DiceActivity
import kotlinx.android.synthetic.main.activity_trials.*

class TrialsActivity : AppCompatActivity() {

    val TAG = "TrialsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trials)

        btn_start_trial.setOnClickListener({
            startActivity(Intent(this, DiceActivity::class.java))
        })

        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

}
