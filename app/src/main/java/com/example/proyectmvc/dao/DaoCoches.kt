package com.example.proyectmvc.dao

import com.example.proyectmvc.interfaces.InterfazDao
import com.example.proyectmvc.models.coche
import com.example.proyectmvc.objects_models.Repository

class DaoCoches private constructor() : InterfazDao {
    companion object {
        val mydao: DaoCoches by lazy {
            DaoCoches()
        }
    }

    override fun getDataHotels(): List<coche> = Repository.listCoches
}