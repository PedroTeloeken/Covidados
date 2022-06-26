package com.example.covidados2.ui.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.covidados2.R
import com.example.covidados2.databinding.ActivityGuestFormBinding
import com.example.covidados2.ui.GuestFormViweModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityGuestFormBinding
    lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioPresent.isChecked = true  //deixa o RadioGroup Present marcado

        viewModel = ViewModelProvider(this).get(GuestFormViweModel::class.java)

        binding.buttonSave.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save){

        }
    }
}