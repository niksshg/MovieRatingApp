package com.example.movieratingquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.poster)
        image.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
        }

        // The same function as above, but made using anonymous class to better understand how the whole mechanism works.
        // Alternatively, the whole class can implement the interface (onClickListener) and using the when statement the reponse can be processed
/*
        val imageClickListener: View.OnClickListener = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_LONG).show()
            }
        }
        image.setOnClickListener(imageClickListener)*/
    }
}