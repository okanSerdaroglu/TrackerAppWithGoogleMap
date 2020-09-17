package com.okan.trackerappwithgooglemaps.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.okan.trackerappwithgooglemaps.R
import com.okan.trackerappwithgooglemaps.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}