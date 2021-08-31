package com.example.survivaltask.data.domain

data class Ranks(
    val rank :Int,
    val countryCode :String,
    val goldMedalNumber :Int,
    val silverMedalNumber :Int,
    val bronzeMedalNumber :Int,
    val totalMedalNumber :Int,
    val rankByTotal :Int
)
