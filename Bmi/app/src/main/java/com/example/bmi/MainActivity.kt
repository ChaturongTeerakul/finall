package com.example.bmi


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var a:Int = 0
    var b:Int = 0
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Ok.setOnClickListener{
            if (weight.text.toString() > "300" || height.text.toString() > "300"){
                Answer.setText("ไม่สามารถคำนวณข้อมูลได้")
            }
            else if(weight.text.toString() < "0" || height.text.toString() < "0"){
                Answer.setText("ไม่สามารถคำนวณข้อมูลได้")
            }
            else{
                a = weight.text.toString().toInt()
                b = height.text.toString().toInt()
                sum = a * (b / b)
                Answer.setText(sum)
            }
        }
        Clear.setOnClickListener{
            weight.setText(" ")
            height.setText(" ")
        }
    }
}