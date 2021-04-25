package com.example.zurincrement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var plus = findViewById<Button>(R.id.button_increment)
        var text = findViewById<TextView>(R.id.increment_textview)
        var increment_number = 0;

        plus.setOnClickListener{

            increment_number++

            text.text = increment_number.toString()
        }

    }
}
