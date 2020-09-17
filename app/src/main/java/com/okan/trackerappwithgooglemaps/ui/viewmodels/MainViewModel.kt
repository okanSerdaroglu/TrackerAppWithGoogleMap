package com.okan.trackerappwithgooglemaps.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.okan.trackerappwithgooglemaps.repositories.MainRepository

class MainViewModel
@ViewModelInject
constructor(
    val mainRepository: MainRepository
) : ViewModel() {


}