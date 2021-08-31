package com.example.survivaltask.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.survivaltask.R
import com.example.survivaltask.data.DataManager
import com.example.survivaltask.databinding.ActivityMainBinding
import com.example.survivaltask.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appStart()
        initializeCallBack()
    }

    private fun appStart() {
        showData()
        val adapter = RanksAdapter(DataManager.ranks)
        binding.recyclerMatch.adapter = adapter
    }

    private fun initializeCallBack() {

    }

    private fun showData() {
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
        val currentRank = parser.parse(it)
            DataManager.addRank(currentRank)
        Log.v("data",it)
        }
    }
}