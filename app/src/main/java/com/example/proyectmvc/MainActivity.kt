package com.example.proyectmvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectmvc.controller.controller
import com.example.proyectmvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var controller: controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        /*setContentView(R.layout.activity_main)*/
    }
}