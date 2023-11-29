package com.example.proyectmvc.models

class coches(
    private var name: String,
    private var escuderia: String,
    private var fabrica: String,
    private var telefono: String,
    private var imagen: String
) {
    override fun toString(): String {
        return "coches(name='$name', city='$escuderia', fabrica='$fabrica', telefono='$telefono', imagen='$imagen')"
    }
}