package dev.fummicc1.lit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plusButton.setOnClickListener {
            number += 1
            showNumber()
            updateTextColor()
        }

        minusButton.setOnClickListener {
            number -= 1
            showNumber()
            updateTextColor()
        }

        clearButton.setOnClickListener {
            number = 0
            showNumber()
            updateTextColor()
        }
    }

    //よさそう
    private fun showNumber() {
        textView.text = number.toString()
    }

    private fun updateTextColor() {
        // みたいな書き方もできる
        // val color = if (number % 3 == 0 && number % 5 == 0) {
        //     Color.RED
        // } else if (number % 5 == 0) {
        //     Color.BLUE
        // } else if (number % 3 == 0) {
        //     Color.GREEN
        // }
        // textView.setTextColor(color)

//        if (number % 3 == 0 && number % 5 == 0) {
//            textView.setTextColor(Color.RED)
//        } else if (number % 5 == 0) {
//            textView.setTextColor(Color.BLUE)
//        } else if (number % 3 == 0) {
//            textView.setTextColor(Color.GREEN)
//        }


        val color = when {
            number % 15 == 0 -> {
                Color.RED
            }
            number % 3 == 0 -> {
                Color.GREEN
            }
            number % 5 == 0 -> {
                Color.BLUE
            }
            else -> {
                Color.BLACK
            }
        }
        textView.setTextColor(color)
    }
}