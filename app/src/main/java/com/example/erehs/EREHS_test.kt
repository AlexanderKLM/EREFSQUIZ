package com.example.erehs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment


class EREHS_test : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.erefs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val score = Guide()
        val main = MainActivity()
        val rb_question11 = view.findViewById<RadioButton>(R.id.radioButton2)
        val rb_question12 = view.findViewById<RadioButton>(R.id.radioButton3)
        val rb_question13 = view.findViewById<RadioButton>(R.id.radioButton4)
        val rb_group1 = view.findViewById<RadioGroup>(R.id.radioGroup)
        val rb_group2 = view.findViewById<RadioGroup>(R.id.radioGroup2)
        val rb_group3 = view.findViewById<RadioGroup>(R.id.radioGroup3)
        val rb_group4 = view.findViewById<RadioGroup>(R.id.radioGroup4)
        val rb_group5 = view.findViewById<RadioGroup>(R.id.radioGroup5)
        val tv_question1 = view.findViewById<TextView>(R.id.textView0)
        val rb_question2 = view.findViewById<TextView>(R.id.textView20)
        val res_button = view.findViewById<Button>(R.id.resbutton)
        val clearEref = view.findViewById<Button>(R.id.buttonERClear)
        var erefs_total = 0
        var erefs_questions = 0



        res_button.setOnClickListener() {
            if (rb_group1.checkedRadioButtonId != -1) {
                erefs_questions += 1

                if (rb_group1.checkedRadioButtonId == R.id.radioButton3) {
                    erefs_total += 1
                }
                if (rb_group1.checkedRadioButtonId == R.id.radioButton4) {
                    erefs_total += 2
                }
            }
            if (rb_group2.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_group2.checkedRadioButtonId == R.id.radioButton22) {
                    erefs_total += 1
                }
                if (rb_group2.checkedRadioButtonId == R.id.radioButton23) {
                    erefs_total += 2
                }
                if (rb_group2.checkedRadioButtonId == R.id.radioButton24) {
                    erefs_total += 3
                }
            }
            if (rb_group3.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_group3.checkedRadioButtonId == R.id.radioButton32) {
                    erefs_total += 1
                }
            }
            if (rb_group4.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_group4.checkedRadioButtonId == R.id.radioButton42) {
                    erefs_total += 1
                }
            }
            if (rb_group5.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_group5.checkedRadioButtonId == R.id.radioButton52) {
                    erefs_total += 1
                }
            }



            val builder = AlertDialog.Builder(requireContext())

            if (erefs_total==1){
                builder.setMessage("Результат исследования EREFS, набран : $erefs_total балл")
            }
            if (erefs_total< 5 && erefs_total > 1){
            builder.setMessage("Результат исследования EREFS, набрано: $erefs_total балла")
            }
            if (erefs_total > 4 || erefs_total==0){
                builder.setMessage("Результат исследования EREFS, набрано: $erefs_total баллов")
            }

            builder.setTitle("Результат")
            builder.setCancelable(false)


            builder.setNegativeButton("OK") {
                    dialog, which -> dialog.cancel()
            }

            val alertDialog = builder.create()
            alertDialog.show()


            erefs_questions = 0
            erefs_total = 0

            }
        clearEref.setOnClickListener(){
            rb_group1.clearCheck()
            rb_group2.clearCheck()
            rb_group3.clearCheck()
            rb_group4.clearCheck()
            rb_group5.clearCheck()
            erefs_questions = 0
            erefs_total = 0
        }

    }


}
