package com.example.survivaltask.util

import com.example.survivaltask.data.domain.Ranks

class CsvParser {
    fun parse(line:String):Ranks{
        val token = line.replace(""", """.toRegex(),"").split(",")
        return Ranks(
            rank = token[Constants.ColumnIndex.Rank].toInt(),
            countryCode = token[Constants.ColumnIndex.NOCCode],
            goldMedalNumber = token[Constants.ColumnIndex.GoldMedalNumber].toInt(),
            silverMedalNumber = token[Constants.ColumnIndex.SilverMedalNumber].toInt(),
            bronzeMedalNumber = token[Constants.ColumnIndex.BronzeMedalNumber].toInt(),
            totalMedalNumber = token[Constants.ColumnIndex.TotalMedalNumber].toInt(),
            rankByTotal = token[Constants.ColumnIndex.RankByTotal].toInt()
        )
    }
}