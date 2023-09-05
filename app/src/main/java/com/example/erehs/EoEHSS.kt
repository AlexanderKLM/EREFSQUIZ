package com.example.erehs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.erehs.databinding.ActivityMainBinding
import com.example.erehs.databinding.EoehssBinding

class EoEHSS: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.eoehss, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val score = Guide()
        val main = MainActivity()
        val rb_groupE1 = view.findViewById<RadioGroup>(R.id.radioGroupE1)
        val rb_groupE2 = view.findViewById<RadioGroup>(R.id.radioGroupE2)
        val rb_groupE3 = view.findViewById<RadioGroup>(R.id.radioGroupE3)
        val rb_groupE4 = view.findViewById<RadioGroup>(R.id.radioGroupE4)
        val rb_groupE5 = view.findViewById<RadioGroup>(R.id.radioGroupE5)
        val rb_groupE6 = view.findViewById<RadioGroup>(R.id.radioGroupE6)
        val rb_groupE7 = view.findViewById<RadioGroup>(R.id.radioGroupE7)
        val rb_groupE8 = view.findViewById<RadioGroup>(R.id.radioGroupE8)
        val rb_groupE9 = view.findViewById<RadioGroup>(R.id.radioGroupE9)
        val rb_groupE10 = view.findViewById<RadioGroup>(R.id.radioGroupE10)
        val rb_groupE11 = view.findViewById<RadioGroup>(R.id.radioGroupE11)
        val rb_groupE12 = view.findViewById<RadioGroup>(R.id.radioGroupE12)
        val rb_groupE13 = view.findViewById<RadioGroup>(R.id.radioGroupE13)
        val rb_groupE14 = view.findViewById<RadioGroup>(R.id.radioGroupE14)
        val rb_groupE15 = view.findViewById<RadioGroup>(R.id.radioGroupE15)
        val rb_groupE16 = view.findViewById<RadioGroup>(R.id.radioGroupE16)
        val clearEoE = view.findViewById<Button>(R.id.buttonEoEClear)
        val res_buttonE = view.findViewById<Button>(R.id.buttonEOE)
        var erefs_totalSTEPEN: Double = 0.0
        var erefs_questionsSTEPEN: Double = 0.0
        var total_STEPEN: Double = 0.0
        var erefs_totalRASP: Double = 0.0
        var erefs_questionsRASP: Double = 0.0
        var total_RASP: Double = 0.0

        fun checkRadioButtonSTEPEN(radioGroup: RadioGroup, @IdRes rb2: Int, @IdRes rb3: Int, @IdRes rb4: Int) {
            if (radioGroup.checkedRadioButtonId != -1) {
                erefs_questionsSTEPEN += 1
                if (radioGroup.checkedRadioButtonId == rb2) {
                    erefs_totalSTEPEN += 1
                }
                if (radioGroup.checkedRadioButtonId == rb3) {
                    erefs_totalSTEPEN += 2
                }
                if (radioGroup.checkedRadioButtonId == rb4) {
                    erefs_totalSTEPEN += 3
                }
                total_STEPEN = (erefs_questionsSTEPEN * 3) / erefs_totalSTEPEN
                if (total_STEPEN == Double.POSITIVE_INFINITY){
                    total_STEPEN = 0.0
                }
            }
        }
        fun checkRadioButtonRASP(radioGroup: RadioGroup, @IdRes rb2: Int, @IdRes rb3: Int, @IdRes rb4: Int) {
            if (radioGroup.checkedRadioButtonId != -1) {
                erefs_questionsRASP += 1
                if (radioGroup.checkedRadioButtonId == rb2) {
                    erefs_totalRASP += 1
                }
                if (radioGroup.checkedRadioButtonId == rb3) {
                    erefs_totalRASP += 2
                }
                if (radioGroup.checkedRadioButtonId == rb4) {
                    erefs_totalRASP += 3
                }
                total_RASP = (erefs_questionsRASP * 3) / erefs_totalRASP
                if (total_RASP == Double.POSITIVE_INFINITY){
                    total_RASP = 0.0
                }
            }
        }


                res_buttonE.setOnClickListener() {
                    checkRadioButtonSTEPEN(rb_groupE1, R.id.radioButtonE02, R.id.radioButtonE03, R.id.radioButtonE04)
                    checkRadioButtonRASP(rb_groupE2, R.id.radioButtonE22, R.id.radioButtonE23, R.id.radioButtonE24)
                    checkRadioButtonSTEPEN(rb_groupE3, R.id.radioButtonE32, R.id.radioButtonE33, R.id.radioButtonE34)
                    checkRadioButtonRASP(rb_groupE4, R.id.radioButtonE42, R.id.radioButtonE43, R.id.radioButtonE44)
                    checkRadioButtonSTEPEN(rb_groupE5, R.id.radioButtonE52, R.id.radioButtonE53, R.id.radioButtonE54)
                    checkRadioButtonRASP(rb_groupE6, R.id.radioButtonE62, R.id.radioButtonE63, R.id.radioButtonE64)
                    checkRadioButtonSTEPEN(rb_groupE7, R.id.radioButtonE72, R.id.radioButtonE73, R.id.radioButtonE74)
                    checkRadioButtonRASP(rb_groupE8, R.id.radioButtonE82, R.id.radioButtonE83, R.id.radioButtonE84)
                    checkRadioButtonSTEPEN(rb_groupE9, R.id.radioButtonE92, R.id.radioButtonE93, R.id.radioButtonE94)
                    checkRadioButtonRASP(rb_groupE10, R.id.radioButtonE102, R.id.radioButtonE103, R.id.radioButtonE104)
                    checkRadioButtonSTEPEN(rb_groupE11, R.id.radioButtonE112, R.id.radioButtonE113, R.id.radioButtonE114)
                    checkRadioButtonRASP(rb_groupE12, R.id.radioButtonE122, R.id.radioButtonE123, R.id.radioButtonE124)
                    checkRadioButtonSTEPEN(rb_groupE13, R.id.radioButtonE132, R.id.radioButtonE133, R.id.radioButtonE134)
                    checkRadioButtonRASP(rb_groupE14, R.id.radioButtonE142, R.id.radioButtonE143, R.id.radioButtonE144)
                    checkRadioButtonSTEPEN(rb_groupE15, R.id.radioButtonE152, R.id.radioButtonE153, R.id.radioButtonE154)
                    checkRadioButtonRASP(rb_groupE16, R.id.radioButtonE162, R.id.radioButtonE163, R.id.radioButtonE164)

                    val builder = AlertDialog.Builder(requireContext())


                    builder.setMessage("Степень поражения: $total_STEPEN, Распространенность (стадия): $total_RASP" )

                    // Set Alert Title
                    builder.setTitle("Результат исследования EoEHSS:")

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false)

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.

                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("OK") {
                        // If user click no then dialog box is canceled.
                            dialog, which ->
                        dialog.cancel()
                    }

                    // Create the Alert dialog
                    val alertDialog = builder.create()
                    // Show the Alert Dialog box
                    alertDialog.show()
                    erefs_questionsSTEPEN = 0.0
                    erefs_totalSTEPEN = 0.0
                    total_STEPEN = 0.0
                    erefs_questionsRASP = 0.0
                    erefs_totalRASP = 0.0
                    total_RASP = 0.0


                }
        clearEoE.setOnClickListener(){
            rb_groupE1.clearCheck()
            rb_groupE2.clearCheck()
            rb_groupE3.clearCheck()
            rb_groupE4.clearCheck()
            rb_groupE5.clearCheck()
            rb_groupE6.clearCheck()
            rb_groupE7.clearCheck()
            rb_groupE8.clearCheck()
            rb_groupE9.clearCheck()
            rb_groupE10.clearCheck()
            rb_groupE11.clearCheck()
            rb_groupE12.clearCheck()
            rb_groupE13.clearCheck()
            rb_groupE14.clearCheck()
            rb_groupE15.clearCheck()
            rb_groupE16.clearCheck()
            erefs_totalSTEPEN = 0.0
            erefs_questionsSTEPEN = 0.0
            total_STEPEN = 0.0
            erefs_totalRASP = 0.0
            erefs_questionsRASP = 0.0
            total_RASP = 0.0
        }

            }
}

