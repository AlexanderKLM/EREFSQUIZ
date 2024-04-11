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

        // Объявление групп кнопок, а также вычисление баллов за тест
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

            //Вывод текста в зависимости от итогового числа
            if (erefs_total == 1) {
                builder.setMessage("Результат исследования I-SEE, набран : $erefs_total балл")
            }
            if (erefs_total < 5 && erefs_total > 1) {
                builder.setMessage("Результат исследования I-SEE, набрано: $erefs_total балла")
            }
            if (erefs_total > 4 || erefs_total==0){
                builder.setMessage("Результат исследования I-SEE, набрано: $erefs_total баллов")
            }
            // Название Alert Box
            builder.setTitle("Результат")

            // Alert Box не будет закрываться если пользователь будет нажимать за границами Alert Box
            builder.setCancelable(false)
            builder.setNegativeButton("OK") {
                    dialog, which ->
                dialog.cancel()
            }

            // Вывод результата в Alert Box
            val alertDialog = builder.create()
            alertDialog.show()
            erefs_questions = 0
            erefs_total = 0


        }
        // Кнопка очистки выбора
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
