package com.example.proyectmvc.objects_models

import com.example.proyectmvc.models.coche

object repository {
    val listCoches: List<coche> = listOf(
        coche(
            "Mercedes-AMG",
            "Mercedes",
            "Mercedes-AMG",
            "+49 123456789",
            "https://images.app.goo.gl/XLxwFFmLeW71VSKq5"
        ),

        coche(
            "Red Bull Racing",
            "Red Bull",
            "Red Bull Racing",
            "+43 987654321",
            "https://images.app.goo.gl/TqtEqFzBpw1zXb6U8"
        )
    )
}