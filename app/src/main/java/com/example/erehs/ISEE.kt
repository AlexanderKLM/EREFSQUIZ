package com.example.erehs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class ISEE: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.isee, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val res = view.findViewById<Button>(R.id.buttonI)
        val clear = view.findViewById<Button>(R.id.buttonIClear)
        val rb_groupI1 = view.findViewById<RadioGroup>(R.id.radioGroupI1)
        val rb_groupI2 = view.findViewById<RadioGroup>(R.id.radioGroupI2)
        val rb_groupI3 = view.findViewById<RadioGroup>(R.id.radioGroupI3)
        val rb_groupI4 = view.findViewById<RadioGroup>(R.id.radioGroupI4)
        val rb_groupI5 = view.findViewById<RadioGroup>(R.id.radioGroupI5)
        val rb_groupI6 = view.findViewById<RadioGroup>(R.id.radioGroupI6)
        var erefs_total = 0
        var erefs_questions = 0

        res.setOnClickListener() {
            if (rb_groupI1.checkedRadioButtonId != -1) {
                erefs_questions += 1

                if (rb_groupI1.checkedRadioButtonId == R.id.radioButtonI11) {
                    erefs_total += 1
                }
                if (rb_groupI1.checkedRadioButtonId == R.id.radioButtonI12) {
                    erefs_total += 2
                }
                if (rb_groupI1.checkedRadioButtonId == R.id.radioButtonI13) {
                    erefs_total += 3
                }
            }
            if (rb_groupI2.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_groupI2.checkedRadioButtonId == R.id.radioButtonI21) {
                    erefs_total += 2
                }
                if (rb_groupI2.checkedRadioButtonId == R.id.radioButtonI22) {
                    erefs_total += 3
                }
                if (rb_groupI2.checkedRadioButtonId == R.id.radioButtonI23) {
                    erefs_total += 15
                }
            }
            if (rb_groupI3.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_groupI3.checkedRadioButtonId == R.id.radioButtonI31) {
                    erefs_total += 1
                }
                if (rb_groupI3.checkedRadioButtonId == R.id.radioButtonI32) {
                    erefs_total += 2
                }
            }

            if (rb_groupI4.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_groupI4.checkedRadioButtonId == R.id.radioButtonI41) {
                    erefs_total += 1
                }
                if (rb_groupI4.checkedRadioButtonId == R.id.radioButtonI42) {
                    erefs_total += 2
                }
            }
            if (rb_groupI5.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_groupI5.checkedRadioButtonId == R.id.radioButtonI51) {
                    erefs_total += 1
                }
                if (rb_groupI5.checkedRadioButtonId == R.id.radioButtonI52) {
                    erefs_total += 2
                }
                if (rb_groupI5.checkedRadioButtonId == R.id.radioButtonI53) {
                    erefs_total += 15
                }
            }
            if (rb_groupI6.checkedRadioButtonId != -1) {
                erefs_questions += 1
                if (rb_groupI6.checkedRadioButtonId == R.id.radioButtonI61) {
                    erefs_total += 2
                }
            }

            val builder = AlertDialog.Builder(requireContext())

            // Set the message show for the Alert time
            if (erefs_total == 1) {
                builder.setMessage("Результат исследования I-SEE, набран : $erefs_total балл")
            }
            if (erefs_total < 5 && erefs_total > 1) {
                builder.setMessage("Результат исследования I-SEE, набрано: $erefs_total балла")
            }
            if (erefs_total > 4 || erefs_total==0){
                builder.setMessage("Результат исследования I-SEE, набрано: $erefs_total баллов")
            }
            // Set Alert Title
            builder.setTitle("Результат")

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


            erefs_questions = 0
            erefs_total = 0


        }
        clear.setOnClickListener() {
            rb_groupI1.clearCheck()
            rb_groupI2.clearCheck()
            rb_groupI3.clearCheck()
            rb_groupI4.clearCheck()
            rb_groupI5.clearCheck()
            rb_groupI6.clearCheck()
            erefs_questions = 0
            erefs_total = 0

        }
    }
}
