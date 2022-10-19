package com.example.cockies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cockies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding ;
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEatOrDone.setOnClickListener{
            if (binding.btnEatOrDone.text.toString() != "DONE") {
                binding.imgEmoji.setImageResource(R.drawable.full)
                binding.btnEatOrDone.text = "DONE"
                binding.txtTitle.text = "I'm so full"
            }
            else{
                finish()
            }
        }
    }
}