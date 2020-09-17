package com.okan.trackerappwithgooglemaps.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.okan.trackerappwithgooglemaps.R
import com.okan.trackerappwithgooglemaps.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()

}