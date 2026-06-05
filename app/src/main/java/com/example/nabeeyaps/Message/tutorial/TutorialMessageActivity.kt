package com.example.nabeeyaps.Message.tutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nabeeyaps.R
import com.example.nabeeyaps.databinding.ActivityTutorialMessageBinding // Pastikan import ini ada

class TutorialMessageActivity : AppCompatActivity() {
    // 1. Ubah tipe data ke kelas binding yang di-generate otomatis
    private lateinit var binding: ActivityTutorialMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 2. Inflate binding dan set content view menggunakan binding.root
        binding = ActivityTutorialMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menggunakan binding.main untuk menyesuaikan ID root di XML
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fragmentsList = listOf(Tutorial1Fragment(), Tutorial2Fragment(), Tutorial3Fragment())
        val adapter = TutorialFragmentAdapter(this, fragmentsList)

        // Sekarang pemanggilan ini tidak akan error lagi
        binding.tutorialMessageViewPager.adapter = adapter

        binding.dotIndicator.attachTo(binding.tutorialMessageViewPager)
    }
}