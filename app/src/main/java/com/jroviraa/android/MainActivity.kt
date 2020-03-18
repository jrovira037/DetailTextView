package com.jroviraa.android

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var phone: View
    private lateinit var delete: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phone = findViewById(R.id.clickable_phone)
        delete = findViewById(R.id.delete)

        phone.setOnClickListener {
            Toast.makeText(this, "Phone copied", Toast.LENGTH_SHORT).show()
        }
        delete.setOnClickListener {
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
