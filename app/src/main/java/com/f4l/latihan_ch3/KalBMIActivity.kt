package com.f4l.latihan_ch3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class KalBMIActivity : AppCompatActivity(){
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
        setContentView(R.layout.activity_bmi)

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
            onClick()
        }

        btn_reset.setOnClickListener {
            reset()
        }

    }

    fun onClick(){
        val height = tb.text.toString().toFloat()
        val weight = bb.text.toString().toFloat()
        val bmi = calculate(weight, height)
        val result = grade(bmi)

        umur_result.text = "${umur.text} tahun"
        tb_result.text = "$height cm"
        bb_result.text = "$weight kg"
        bmi_result.text = String.format("%.1f", bmi)
        kategori.text = result
    }

    fun calculate(weight: Float, height: Float) : Float{
        val cal = weight / ((height / 100) * (height / 100))
        return cal
    }

    fun grade(BMI : Float) : String{
        val diagnostic = when (BMI) {
            in 0f..16f -> "Telalu Kurus"
            in 16f..17f -> "Cukup Kurus"
            in 17f..18.5f -> "Sedikit Kurus"
            in 18.5f..25f -> "Normal"
            in 25f..30f -> "Gemuk"
            in 30f..35f -> "Obesitas Kelas I"
            in 35f..40f -> "Obesitas Kelas II"
            else -> "Obesitas III"
        }

        return diagnostic
    }

    fun reset(){
        umur.setText("")
        tb.setText("")
        bb.setText("")

        umur_result.text = ""
        tb_result.text = ""
        bb_result.text = ""
        bmi_result.text = ""
        kategori.text= ""
    }

}
