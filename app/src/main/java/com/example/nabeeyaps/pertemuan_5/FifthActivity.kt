package com.example.nabeeyaps.pertemuan_5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nabeeyaps.R
import com.google.android.material.snackbar.Snackbar
import com.example.nabeeyaps.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. INI HARUS PALING ATAS
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 2. SETELAH binding diinisialisasi, baru gunakan binding.xxx
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Improvisasi: Aksi FAB ditekan!", Snackbar.LENGTH_SHORT).show()
        }

        setSupportActionBar(binding.toolbar)

        supportActionBar?.apply {
            title = "Activity Fifth"
            subtitle = "Ini adalah subtitle"
            setDisplayHomeAsUpEnabled(true)
            // Pastikan R.drawable.baseline_arrow_back_24 ada di folder drawable-mu
            // Jika error, hapus baris setHomeAsUpIndicator ini
        }

        binding.btnWebView.setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            R.id.action_search -> {
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_wa -> {
                Toast.makeText(this, "Share WhatsApp", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_email -> {
                Toast.makeText(this, "Share Email", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}