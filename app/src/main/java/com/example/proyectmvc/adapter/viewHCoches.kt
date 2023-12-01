package com.example.proyectmvc.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectmvc.databinding.ItemlistCardviewBinding
import com.example.proyectmvc.models.coche

class viewHCoches(
    view: View,
    var deleteOnClick: (Int) -> Unit,
    var updateOnClick: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {
    private var binding: ItemlistCardviewBinding

    init {
        binding = ItemlistCardviewBinding.bind(view)
    }

    fun renderize(car: coche, position: Int) {
        binding.textName.text = car.name
        binding.textEscuderia.text = car.escuderia
        binding.textFabrica.text = car.fabrica
        binding.textContacto.text = car.telefono

        Glide
            .with(itemView.context)
            .load(car.imagen)
            .centerCrop()
            .into(binding.idImgPpal)

        setOnClickListener(position)
    }

    private fun setOnClickListener(position: Int) {
        binding.btnEdit.setOnClickListener {
            updateOnClick(position)
        }
        binding.btnDel.setOnClickListener {
            deleteOnClick(position)
        }
    }
}