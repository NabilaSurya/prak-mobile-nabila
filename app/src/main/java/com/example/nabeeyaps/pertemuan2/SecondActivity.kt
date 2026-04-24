package com.example.nabeeyaps.pertemuan2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.MenuItem
import com.example.nabeeyaps.databinding.ActivitySecondBinding
import com.example.nabeeyaps.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi komponen
        val inputNama: EditText = findViewById(R.id.inputNama)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        btnSubmit.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val nama = inputNama.text.toString()
            Log.e("Klik btnSubmit","Isi dari inputNama = $nama")

            Toast.makeText(this,"Anda telah melakukan klik pada tombol Submit", Toast.LENGTH_SHORT).show()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}