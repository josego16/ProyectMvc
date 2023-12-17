package com.example.proyectmvc.controller

import android.content.Context
import android.widget.Toast
import com.example.proyectmvc.MainActivity
import com.example.proyectmvc.adapter.AdapterCoches
import com.example.proyectmvc.dao.DaoCoches
import com.example.proyectmvc.models.Coche

class Controller(private val context: Context) {
    private lateinit var listCoches: MutableList<Coche>
    private lateinit var adapterCoches: AdapterCoches

    init {
        initData()
    }

    private fun initData() {
        listCoches = DaoCoches.mydao.getDataCoches().toMutableList()
    }

    fun loggOut() {
        Toast.makeText(context, "Datos mostrados por pantalla", Toast.LENGTH_LONG).show()
        listCoches.forEach {
            println(it)
        }
    }

    fun setAdapter() {
        val myActivity = context as MainActivity
        adapterCoches = AdapterCoches(
            listCoches,
            { pos ->
                delCoche(pos)
            },
            { pos ->
                updateCoche(pos)
            }
        )
        myActivity.mainBinding.myRecyclerView.adapter = adapterCoches
    }

    private fun updateCoche(pos: Int) {

    }

    private fun delCoche(pos: Int) {
        Toast.makeText(context, "Borramos el coche con la posicion $pos", Toast.LENGTH_LONG).show()
        listCoches.removeAt(pos)
        adapterCoches.notifyItemRemoved(pos)
    }
}