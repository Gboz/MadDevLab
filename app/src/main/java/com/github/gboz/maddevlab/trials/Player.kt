package com.github.gboz.maddevlab.trials

import java.util.*
import kotlin.collections.ArrayList

class Player constructor( _nickName: String){

    var nickName: String = _nickName
    var score: ArrayList<Int> = ArrayList()

    fun firstRoll(_score: ArrayList<Int>) {
        val random: Random = Random()
        for (i in 1..5) {
            score.add(random.nextInt(5 + 1) + 1)
        }
        _score.addAll(score)
    }

    fun roll(_score: ArrayList<Int>) {
        val random: Random = Random()
        for (i in 0..4) {
            if (_score[i] == 0) {
                _score.set(i, random.nextInt(5 + 1) + 1)
            }
        }
    }

}