package com.f4l.latihan_ch3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var umur : EditText
    lateinit var tb : EditText
    lateinit var bb : EditText
    lateinit var btn_hitung : Button
    lateinit var btn_reset : Button
    lateinit var umur_result : TextView
    lateinit var tb_result : TextView
    lateinit var bb_result : TextView
    lateinit var bmi_result : TextView
    lateinit var kategori : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        umur = findViewById(R.id.umur)
        tb = findViewById(R.id.tb)
        bb = findViewById(R.id.bb)
        btn_hitung = findViewById(R.id.btn_hitung)
        btn_reset = findViewById(R.id.btn_reset)
        umur_result = findViewById(R.id.result_umur)
        tb_result = findViewById(R.id.result_tb)
        bb_result = findViewById(R.id.result_bb)
        bmi_result = findViewById(R.id.result)
        kategori = findViewById(R.id.kategori)

        btn_hitung.setOnClickListener {
            Calculate()
        }

    }

    fun Calculate() {
        val u = umur.toString()
        umur_result.text = u

        val t = tb.toString()
        tb_result.text = t
        val n1 = tb.text.toString().toDouble()/100

        val b = bb.toString()
        bb_result.text = b
        val n2 = bb.text.toString().toDouble()

        val bmi : Double =  n2/(n1*n1)
        val cal = bmi.toString()
        bmi_result.text = cal

        val grade = (if(bmi < 16){
            "Telalu Kurus"
        }else if(bmi >= 16 && bmi < 17){
            "Cukup Kurus"
        }else if(bmi >= 17 && bmi < 18.5){
            "Sedikit Kurus"
        }else if(bmi >= 18.5 && bmi < 25){
            "Normal"
        }else if(bmi >= 25 && bmi < 30){
            "Gemuk"
        }else if(bmi >= 30 && bmi < 33){
            "Obesitas Kelas I"
        }else if( bmi >= 33 && bmi < 40){
            "Obesitas Kelas II"
        }else{
            "Obesitas Kelas III"
        }).toString()
        kategori.text = grade
    }

}