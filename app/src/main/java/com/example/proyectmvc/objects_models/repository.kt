package com.example.proyectmvc.objects_models

import com.example.proyectmvc.models.coches

object Repository {
    val listcochess: List<coches> = listOf(
        coches(
            "Mercedes-AMG F1 W12",
            "Mercedes",
            "Mercedes-AMG Petronas Formula One Team",
            "+49 123456789",
            "https://example.com/mercedes-amg-f1-w12.jpg"
        ),

        coches(
            "Red Bull Racing RB16B",
            "Red Bull",
            "Red Bull Racing",
            "+43 987654321",
            "https://example.com/red-bull-racing-rb16b.jpg"
        )
    )
}