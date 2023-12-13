package com.example.proyectmvc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectmvc.R
import com.example.proyectmvc.models.Coche

class AdapterCoches(
    private var listaCoches: MutableList<Coche>,
    private var deleteOnClick: (Int) -> Unit,
    private var updateOnClick: (Int) -> Unit
) : RecyclerView.Adapter<ViewHCoches>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHCoches {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutItemCar = R.layout.itemlist_cardview
        return ViewHCoches(
            layoutInflater.inflate(layoutItemCar, parent, false),
            deleteOnClick,
            updateOnClick
        )
    }

    override fun onBindViewHolder(holder: ViewHCoches, position: Int) {
        holder.renderize(listaCoches[position], position)
    }

    override fun getItemCount(): Int = listaCoches.size
}