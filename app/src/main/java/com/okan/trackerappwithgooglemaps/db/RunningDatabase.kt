package com.okan.trackerappwithgooglemaps.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRoomDao(): RunDAO

    companion object {
        const val RUNNING_DATABASE_NAME = "running_database"
    }

}