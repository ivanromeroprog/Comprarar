package com.curso.android.app.practica.comprarar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import com.curso.android.app.practica.comprarar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonComparar.setOnClickListener{
            mainViewModel.comparar(binding.editTextText.text.toString(), binding.editTextText2.text.toString())
        }

        mainViewModel.texts.observe(this){
            binding.textView.text = it.result
        }
    }
}