package com.example.android_sportliste.data

import com.example.android_sportliste.R
import com.example.android_sportliste.data.model.Tennismen

class Datasource {

    fun loadPlayers(): List<Tennismen> {
        return listOf(
            Tennismen(
                R.string.rankPlayer1,
                R.drawable.serbia,
                R.string.player1,
                R.string.scorePlayer1
            ),
            Tennismen(
                R.string.rankPlayer2,
                R.drawable.spain,
                R.string.player2,
                R.string.scorePlayer2
            ),
            Tennismen(
                R.string.rankPlayer3,
                R.drawable.greece,
                R.string.player3,
                R.string.scorePlayer3
            ),
            Tennismen(
                R.string.rankPlayer4,
                R.drawable.norwegia,
                R.string.player4,
                R.string.scorePlayer4
            ),
            Tennismen(
                R.string.rankPlayer5,
                R.drawable.america,
                R.string.player5,
                R.string.scorePlayer5
            ),
            Tennismen(
                R.string.rankPlayer6,
                R.drawable.russia,
                R.string.player6,
                R.string.scorePlayer6
            ),
            Tennismen(
                R.string.rankPlayer7,
                R.drawable.russia,
                R.string.player7,
                R.string.scorePlayer7
            ),
            Tennismen(
                R.string.rankPlayer8,
                R.drawable.spain,
                R.string.player8,
                R.string.scorePlayer8
            ),
            Tennismen(
                R.string.rankPlayer9,
                R.drawable.canada,
                R.string.player9,
                R.string.scorePlayer9
            ),
            Tennismen(
                R.string.rankPlayer10,
                R.drawable.denmark,
                R.string.player10,
                R.string.scorePlayer10
            ),
            Tennismen(
                R.string.rankPlayer11,
                R.drawable.romania_flag,
                R.string.player11,
                R.string.scorePlayer11
            ),Tennismen(
                R.string.rankPlayer12,
                R.drawable.romania_flag,
                R.string.player12,
                R.string.scorePlayer12
            ),

        )
    }

}