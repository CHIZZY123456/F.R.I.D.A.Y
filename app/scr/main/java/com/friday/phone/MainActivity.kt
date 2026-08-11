package com.friday.phone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "F.R.I.D.A.Y."
            textSize = 32f
            gravity = android.view.Gravity.CENTER
        }

        setContentView(text)
    }
}
