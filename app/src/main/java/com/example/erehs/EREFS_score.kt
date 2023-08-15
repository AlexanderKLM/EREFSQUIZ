package com.example.erehs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class EREFS_score: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.erefs_score, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.textViewES)
        val score = view.findViewById<TextView>(R.id.textViewScore)
        val back = view.findViewById<Button>(R.id.ESBack)
        val Next = view.findViewById<Button>(R.id.ESNext)




    }
}