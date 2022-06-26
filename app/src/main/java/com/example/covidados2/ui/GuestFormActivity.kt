package com.example.covidados2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.covidados2.R
import com.example.covidados2.databinding.ActivityGuestFormBinding

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityGuestFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioPresent.isChecked = true

        binding.buttonSave.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save){

        }
    }
}