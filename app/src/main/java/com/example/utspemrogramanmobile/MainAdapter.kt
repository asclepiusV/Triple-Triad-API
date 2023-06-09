package com.example.utspemrogramanmobile

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView


class MainAdapter(val tripleTriadList: List<TripleTriadData>) : RecyclerView.Adapter<MainViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder (LayoutInflater.from(parent.context).inflate(R.layout.card_list, parent, false))
    }

    override fun getItemCount(): Int {
        return tripleTriadList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindData(tripleTriadList[position])
    }


}