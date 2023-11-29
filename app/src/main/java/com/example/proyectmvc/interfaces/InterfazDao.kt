package com.example.proyectmvc.interfaces

import com.example.proyectmvc.models.coche
import com.example.proyectmvc.objects_models.Repository

interface InterfazDao {
    fun getDataHotels(): List<coche> = Repository.listCoches
}