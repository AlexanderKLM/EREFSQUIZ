package com.example.erehs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val erefs = EREHS_test()
        val eoehss = EoEHSS()



        val mp_Button: Button = findViewById(R.id.mp_Button)
        mp_Button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mp_Main, erefs )
                addToBackStack(null)

                commit()
            }
        }

        }
    }
