package com.shahnoza.onbackpressedfunksiyasihandler

import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var isSelected:Boolean=false
    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)




        text=findViewById(R.id.btnbackPressed)
        onBackPressed()

    }
    override fun onBackPressed() {
        if (isSelected == true){
            super.onBackPressed()
        }else{
            isSelected = true
            text.text = "true"
            Toast.makeText(this, "Dasturdan chiqish uchun yana bir marta bosing!", Toast.LENGTH_SHORT).show()
        }
        val handler = Handler()
        handler.postDelayed({
            isSelected = false
            text.text = "false"
        },3000)
    }

}