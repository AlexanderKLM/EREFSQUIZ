package com.example.erehs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Guide: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.choose_guide, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val Beref = view.findViewById<Button>(R.id.buttonCGB1)
        val Beoeh = view.findViewById<Button>(R.id.buttonCGB2)
        val Bsee = view.findViewById<Button>(R.id.buttonCGB3)
        val eref = ErefGuide()
        val eoeh = EoGuide()
        val isee = IseeGuide()
       // setCurrentFragment(eoeh)
        Beref.setOnClickListener() {
            setCurrentFragment(eref)
        }
        Beoeh.setOnClickListener() {
            setCurrentFragment(eoeh)
        }
        Bsee.setOnClickListener() {
            setCurrentFragment(isee)
        }

    }
    fun setCurrentFragment(fragment: Fragment)=
        activity?.supportFragmentManager?.beginTransaction()?.apply {
            replace(R.id.frameLayoutG, fragment)
            addToBackStack(null)
            commit()
        }

}