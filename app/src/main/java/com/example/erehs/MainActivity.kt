package com.example.erehs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val erefs = EREHS_test()
        val eoehss = EoEHSS()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setCurrentFragment(erefs)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.eref_menu->setCurrentFragment(erefs)
                R.id.eoehss_menu->setCurrentFragment(eoehss)
                //R.id.help_menu->setCurrentFragment(thirdFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }


}

