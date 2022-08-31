package com.f4l.latihan_ch3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Latihan1Activity : AppCompatActivity() {
    lateinit var _input1 : EditText
    lateinit var _input2 : EditText
    lateinit var btn_result : Button
    lateinit var txt_result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan1)

        _input1 = findViewById(R.id.input1)
        _input2 = findViewById(R.id.input2)
        btn_result = findViewById(R.id.btn_calcu)
        txt_result = findViewById(R.id.txt_result)

        btn_result.setOnClickListener {
            var n1 = _input1.text.toString().toInt()
            var n2 = _input2.text.toString().toInt()
            var calcu = n1 + n2

            txt_result.text = calcu.toString()
        }

    }

}