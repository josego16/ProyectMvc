package com.example.proyectmvc.models

class coche(
    var name: String,
    var escuderia: String,
    var fabrica: String,
    var telefono: String,
    var imagen: String
) {
    override fun toString(): String {
        return "coche(name='$name', city='$escuderia', fabrica='$fabrica', telefono='$telefono', imagen='$imagen')"
    }
}