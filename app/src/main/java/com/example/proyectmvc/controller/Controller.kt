package com.example.proyectmvc.controller

import android.content.Context
import android.widget.Toast
import com.example.proyectmvc.MainActivity
import com.example.proyectmvc.adapter.adapterCoches
import com.example.proyectmvc.dao.DaoCoches
import com.example.proyectmvc.models.coche

class Controller(private val context: Context) {
    private lateinit var listCoches: MutableList<coche>

    init {
        initData()
    }

    private fun initData() {
        listCoches = DaoCoches.mydao.getDataHotels().toMutableList()
    }

    fun loggOut() {
        Toast.makeText(context, "Datos mostrados por pantalla", Toast.LENGTH_LONG).show()
        listCoches.forEach {
            println(it)
        }
    }

    fun setAdapter() {
        val myActivity = context as MainActivity
        myActivity.mainBinding.myRecyclerView.adapter = adapterCoches(listCoches)
    }
}