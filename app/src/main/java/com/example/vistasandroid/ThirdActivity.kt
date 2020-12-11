package com.example.vistasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vistasandroid.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imagePanic.setOnClickListener(){
            Toast.makeText(this, "AAAAAHHHHH", Toast.LENGTH_LONG).show()
        }
    }
}