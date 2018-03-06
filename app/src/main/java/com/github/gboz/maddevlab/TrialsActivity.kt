package com.github.gboz.maddevlab

import android.content.Intent
import android.support.v7.app.AppCompatActivity

import android.os.Bundle

import com.github.gboz.maddevlab.trials.DiceActivity
import kotlinx.android.synthetic.main.activity_trials.*

class TrialsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trials)

        btn_start_trial.setOnClickListener({
            startActivity(Intent(this, DiceActivity::class.java))
        })

    }




}
