package com.example.erehs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val erefs = EREHS_test()
        val eoehss = EoEHSS()
        val ie = ISEE()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setCurrentFragment(erefs)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.eref_menu->setCurrentFragment(erefs)
                R.id.eoehss_menu->setCurrentFragment(eoehss)
                R.id.ie_menu->setCurrentFragment(ie)

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

