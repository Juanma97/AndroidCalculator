package com.juanmaperez.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewOne.setOnClickListener { appendOnExpression("1", true) }
        textViewTwo.setOnClickListener { appendOnExpression("2", true) }
        textViewThree.setOnClickListener { appendOnExpression("3", true) }
        textViewFour.setOnClickListener { appendOnExpression("4", true) }
        textViewFive.setOnClickListener { appendOnExpression("5", true) }
        textViewSix.setOnClickListener { appendOnExpression("6", true) }
        textViewSeven.setOnClickListener { appendOnExpression("7", true) }
        textViewEight.setOnClickListener { appendOnExpression("8", true) }
        textViewNine.setOnClickListener { appendOnExpression("9", true) }
        textViewZero.setOnClickListener { appendOnExpression("0", true) }
        textViewDot.setOnClickListener { appendOnExpression(".", true) }

        textViewPlus.setOnClickListener { appendOnExpression("+", false) }
        textViewMinus.setOnClickListener { appendOnExpression("-", false) }
        textViewMultiply.setOnClickListener { appendOnExpression("*", false) }
        textViewDivide.setOnClickListener { appendOnExpression("/", false) }
        textViewOpenParenthesis.setOnClickListener { appendOnExpression("(", false) }
        textViewCloseParenthesis.setOnClickListener { appendOnExpression(")", false) }

        textViewCE.setOnClickListener {
            textViewExpression.text = ""
            textViewResult.text = ""
        }

        buttonBack.setOnClickListener {
            val string = textViewExpression.text.toString()
            if (string.isNotEmpty()) {
                textViewExpression.text = string.substring(0, string.length - 1)
            }
            textViewResult.text = ""
        }
    }

    fun appendOnExpression(string: String, canClear: Boolean) {
        if (canClear) {
            textViewResult.text = ""
            textViewExpression.append(string)
        } else {
            textViewExpression.append(textViewResult.text)
            textViewExpression.append(string)
            textViewResult.text = ""
        }
    }
}
