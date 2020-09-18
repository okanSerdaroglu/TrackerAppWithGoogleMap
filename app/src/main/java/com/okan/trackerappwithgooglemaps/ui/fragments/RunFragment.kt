package com.okan.trackerappwithgooglemaps.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.okan.trackerappwithgooglemaps.R
import com.okan.trackerappwithgooglemaps.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_run.*

/** While injecting viewModels in the fragment we do not have to write inject
 *  We use private val viewModel: MainViewModel by viewModels() this line of code
 *  and Dagger will select the correct viewModel for us and assign it our viewModel variable
 */

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
        }
    }

}