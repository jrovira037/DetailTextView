package com.jroviraa.android

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jroviraa.detailtextview.DetailTextView

class MainActivity : AppCompatActivity() {

    private lateinit var phone: View
    private lateinit var delete: View
    private lateinit var changeColors: DetailTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phone = findViewById(R.id.clickable_phone)
        delete = findViewById(R.id.delete)
        changeColors = findViewById(R.id.change_color_programatically)

        phone.setOnClickListener {
            Toast.makeText(this, "Phone copied", Toast.LENGTH_SHORT).show()
        }
        delete.setOnClickListener {
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show()
        }

        changeColors.setTitleColor(getColor(android.R.color.black))
        changeColors.setTextColor(getColor(R.color.colorAccent))
        changeColors.setIconTint(getColor(R.color.colorPrimaryDark))
    }
}
