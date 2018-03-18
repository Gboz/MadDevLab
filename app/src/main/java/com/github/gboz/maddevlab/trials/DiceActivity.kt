package com.github.gboz.maddevlab.trials

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.gboz.maddevlab.R
import kotlinx.android.synthetic.main.activity_dice.*
import java.util.ArrayList

class DiceActivity : AppCompatActivity() {

    val TAG = "DiceActivity"
    var firstPlayerScore: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        var playerOne = Player("Dzon")
        var playerTwo = Player("Dzoana")

        playerOne.firstRoll(firstPlayerScore)
        btn_cube_one_first_player.setText(firstPlayerScore[0].toString())
        btn_cube_two_first_player.setText(firstPlayerScore[1].toString())
        btn_cube_three_first_player.setText(firstPlayerScore[2].toString())
        btn_cube_four_first_player.setText(firstPlayerScore[3].toString())
        btn_cube_five_first_player.setText(firstPlayerScore[4].toString())

        btn_roll_first_player.setOnClickListener {
            playerOne.roll(firstPlayerScore)
            btn_cube_one_first_player.setText(firstPlayerScore[0].toString())
            btn_cube_two_first_player.setText(firstPlayerScore[1].toString())
            btn_cube_three_first_player.setText(firstPlayerScore[2].toString())
            btn_cube_four_first_player.setText(firstPlayerScore[3].toString())
            btn_cube_five_first_player.setText(firstPlayerScore[4].toString())
        }

        btn_cube_one_first_player.setOnClickListener {
            firstPlayerScore.set(0, 0)
            btn_cube_one_first_player.setText("?")
        }
        btn_cube_two_first_player.setOnClickListener {
            firstPlayerScore.set(1, 0)
            btn_cube_two_first_player.setText("?")
        }
        btn_cube_three_first_player.setOnClickListener {
            firstPlayerScore.set(2, 0)
            btn_cube_three_first_player.setText("?")
        }
        btn_cube_four_first_player.setOnClickListener {
            firstPlayerScore.set(3, 0)
            btn_cube_four_first_player.setText("?")
        }
        btn_cube_five_first_player.setOnClickListener {
            firstPlayerScore.set(4, 0)
            btn_cube_five_first_player.setText("?")
        }

        Log.d(TAG, firstPlayerScore.toString())

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
