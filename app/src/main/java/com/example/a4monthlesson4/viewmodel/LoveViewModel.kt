package com.example.a4monthlesson4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.a4monthlesson4.remote.LoveModel
import com.example.a4monthlesson4.repository.Repository

class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLove(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLove(firstName, secondName)
    }
}