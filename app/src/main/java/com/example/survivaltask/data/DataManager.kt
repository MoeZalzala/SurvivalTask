package com.example.survivaltask.data

import com.example.survivaltask.data.domain.Ranks

object DataManager {
    private val rankList = mutableListOf<Ranks>()
    val ranks: List<Ranks>
    get() = rankList
    val rankIndex:Int = 0

    fun addRank(rank:Ranks){
        rankList.add(rank)
    }

    fun getCurrenRank(){
        println(rankList[rankIndex])
    }
}