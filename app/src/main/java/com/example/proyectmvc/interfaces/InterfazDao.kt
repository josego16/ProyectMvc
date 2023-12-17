package com.example.proyectmvc.interfaces

import com.example.proyectmvc.models.Coche
import com.example.proyectmvc.objects_models.Repository

interface InterfazDao {
    fun getDataCoches(): List<Coche> = Repository.listCoches
}