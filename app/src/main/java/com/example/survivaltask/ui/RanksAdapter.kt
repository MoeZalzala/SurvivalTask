package com.example.survivaltask.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.survivaltask.R
import com.example.survivaltask.data.domain.Ranks
import com.example.survivaltask.databinding.ItemRankBinding

class RanksAdapter(val list:List<Ranks>):RecyclerView.Adapter<RanksAdapter.RankViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankViewHolder {

       val view = LayoutInflater.from(parent.context).
       inflate(R.layout.item_rank,parent,false)

        return RankViewHolder(view)
    }

    override fun onBindViewHolder(holder: RankViewHolder, position: Int) {
        val currentRank = list[position]
        holder.apply {
            binding.rankData.text = currentRank.rank.toString()
            binding.countryData.text = currentRank.countryCode
            binding.goldData.text = currentRank.goldMedalNumber.toString()
            binding.silverData.text = currentRank.silverMedalNumber.toString()
            binding.bronzeData.text = currentRank.bronzeMedalNumber.toString()
            binding.totalData.text = currentRank.totalMedalNumber.toString()
            binding.rankByTotalData.text = currentRank.rankByTotal.toString()

        }
    }

    override fun getItemCount()= list.size
    class RankViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemRankBinding.bind(viewItem)
    }
}