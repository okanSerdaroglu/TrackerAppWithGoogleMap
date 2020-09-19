package com.okan.trackerappwithgooglemaps.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.okan.trackerappwithgooglemaps.utils.Constants.ACTION_PAUSE_SERVICE
import com.okan.trackerappwithgooglemaps.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.okan.trackerappwithgooglemaps.utils.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

/** we are using LifecycleService, because we are going to listen
 * liveData objects from this service. For this reason this class
 * should be a LifecycleService
 */
class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Started or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Paused Service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stopped Service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

}