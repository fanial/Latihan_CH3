package com.f4l.latihan_ch3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NilaiAkhirActivity : AppCompatActivity(){
    lateinit var nama : EditText
    lateinit var nim : EditText
    lateinit var nUas : EditText
    lateinit var nUts : EditText
    lateinit var nTugas : EditText
    lateinit var hasilNilai : Button
    lateinit var reset : Button
    lateinit var vNama : TextView
    lateinit var vNim : TextView
    lateinit var vUas : TextView
    lateinit var vUts : TextView
    lateinit var vTugas : TextView
    lateinit var vTotal : TextView
    lateinit var vAvg : TextView
    lateinit var vGrade : TextView
    lateinit var vStatus : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai)
        nama = findViewById(R.id.nama)
        nim = findViewById(R.id.nim)
        nUas = findViewById(R.id.nUas)
        nUts = findViewById(R.id.nUts)
        nTugas = findViewById(R.id.nTugas)
        hasilNilai = findViewById(R.id.hitungNilai)
        reset = findViewById(R.id.reset)
        vNama = findViewById(R.id.vNama)
        vNim = findViewById(R.id.vNim)
        vUas = findViewById(R.id.vUas)
        vUts = findViewById(R.id.vUts)
        vTugas = findViewById(R.id.vTugas)
        vTotal = findViewById(R.id.vTotal)
        vAvg = findViewById(R.id.vAvg)
        vGrade = findViewById(R.id.vGrade)
        vStatus = findViewById(R.id.vStatus)

        hasilNilai.setOnClickListener {
            hitungNilai()
        }

        reset.setOnClickListener {
            reset()
        }
    }

    fun hitungNilai() {
        var nama = nama.text.toString()
        vNama.text = nama
        var nim = nim.text.toString()
        vNim.text = nim
        var uas = nUas.text.toString()
        vUas.text = uas
        var uts = nUts.text.toString()
        vUts.text = uts
        var tugas = nTugas.text.toString()
        vTugas.text = tugas
        var totalNilai = uas.toInt() + uts.toInt() + tugas.toInt()
        vTotal.text = totalNilai.toString()
        var rataRata = totalNilai / 3
        vAvg.text = rataRata.toString()

        if (rataRata in 91..100) {
            vGrade.text = "A"
        } else if (rataRata in 81..90) {
            vGrade.text = "B"
        } else if (rataRata in 71..80) {
            vGrade.text = "C"
        } else if (rataRata in 61..70) {
            vGrade.text = "D"
        } else {
            vGrade.text = "E"
        }

        if (vGrade.text == "A") {
            vStatus.text = "Lolos"
        } else if (vGrade.text == "B") {
            vStatus.text = "Lolos"
        } else if (vGrade.text == "C") {
            vStatus.text = "Lolos"
        } else if (vGrade.text == "D") {
            vStatus.text = "Tidak Lolos"
        } else {
            vStatus.text = "Tidak Lolos"
        }
    }

    fun reset() {
        nama.setText("")
        nim.setText("")
        nUas.setText("")
        nUts.setText("")
        nTugas.setText("")
        hasilNilai.setText("")
        reset.setText("")
        vNama.setText("")
        vNim.setText("")
        vUas.setText("")
        vUts.setText("")
        vTugas.setText("")
        vTotal.setText("")
        vAvg.setText("")
        vGrade.setText("")
        vStatus.setText("")
    }
}