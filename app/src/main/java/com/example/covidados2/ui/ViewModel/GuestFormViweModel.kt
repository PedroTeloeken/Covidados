package com.example.covidados2.ui.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.covidados2.ui.repository.GuestRepository

class GuestFormViweModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)


    //teste para ver se funciona789

}