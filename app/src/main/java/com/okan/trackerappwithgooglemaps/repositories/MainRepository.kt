package com.okan.trackerappwithgooglemaps.repositories

import com.okan.trackerappwithgooglemaps.db.Run
import com.okan.trackerappwithgooglemaps.db.RunDAO
import javax.inject.Inject

/** There is no provide function for MainRepository, however we can inject it.
 * Because there is only one dependency for MainRepository which is runDAO.
 * In our AppModule we created a provide function for RunDAO. For this reason
 * Dagger knows how to generate RunDAO and also, how to generate MainRepository.
 */
class MainRepository
@Inject
constructor(
    private val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByAverageSpeed() = runDAO.getAllRunsSortedByAverageSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAverageSpeed() = runDAO.getTotalAverageSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

}