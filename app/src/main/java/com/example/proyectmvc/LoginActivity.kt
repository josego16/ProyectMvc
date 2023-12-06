package com.example.proyectmvc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectmvc.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initEvent()
    }

    private fun validarLogin(datos: String): Boolean {
        val regex = Regex("^[a-zA-Z][0-9a-zA-z]+$")
        return datos.matches(regex)
    }

    private fun initEvent() {
        binding.idBtnLogin.setOnClickListener {
            val username = binding.idEtUser.text.toString()
            val password = binding.idEtPassword.text.toString()

            if (validarLogin(username) && validarLogin(password)) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", username)
                intent.putExtra("password", password)
                startActivity(intent)
            } else {
                binding.idEtUser.error = "Formato incorrecto"
                binding.idEtPassword.error = "Formato incorrecto"
            }
        }
    }
}