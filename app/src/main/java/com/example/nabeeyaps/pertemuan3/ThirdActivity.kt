package com.example.nabeeyaps.pertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.nabeeyaps.R
import com.example.nabeeyaps.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var inputNoTujuan: EditText
    private lateinit var btnKirim: Button

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        binding.btnKirim.setOnClickListener {
            val nomor = binding.inputNoTujuan.text.toString()

            if (nomor.isNotEmpty()) {
                Toast.makeText(this, "Pesan berhasil dikirim ke: $nomor", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ThirdResultActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Nomor tidak boleh kosong", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}