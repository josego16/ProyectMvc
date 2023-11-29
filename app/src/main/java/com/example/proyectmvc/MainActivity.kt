package com.example.proyectmvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectmvc.controller.Controller
import com.example.proyectmvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var control: Controller
    lateinit var mainBinding: ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        iniciar()
    }

    private fun iniciar() {
        initRecyclerView()
        control = Controller(this)
        control.setAdapter()
        control.loggOut()
    }

    private fun initRecyclerView() {
        mainBinding.myRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}