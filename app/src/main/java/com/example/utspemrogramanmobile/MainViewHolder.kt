package com.example.utspemrogramanmobile

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class MainViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bindData(tripleTriadData: TripleTriadData)
    {
        val name = itemView.findViewById<TextView>(R.id.titleVG)
        val image = itemView.findViewById<ImageView>(R.id.imageVG)
        val desc = itemView.findViewById<TextView>(R.id.description)

        name.text = tripleTriadData.name
        image.load(tripleTriadData.image)
        desc.text = tripleTriadData.description
    }
}