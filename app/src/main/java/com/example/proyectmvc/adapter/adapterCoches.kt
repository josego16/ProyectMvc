package com.example.proyectmvc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectmvc.R
import com.example.proyectmvc.models.coche

class adapterCoches(private var listaCoches: MutableList<coche>) : RecyclerView.Adapter<viewHCoches>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHCoches {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutItemCar = R.layout.itemlist_cardview
        return viewHCoches(layoutInflater.inflate(layoutItemCar, parent, false))
    }

    override fun onBindViewHolder(holder: viewHCoches, position: Int) {
        holder.renderize(listaCoches[position])
    }

    override fun getItemCount(): Int = listaCoches.size

}