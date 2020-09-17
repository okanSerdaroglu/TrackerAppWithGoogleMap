package com.okan.trackerappwithgooglemaps.di

import android.content.Context
import androidx.room.Room
import com.okan.trackerappwithgooglemaps.db.RunningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RunningDatabase.RUNNING_DATABASE_NAME
    ).build()


    // RunningDatabase generated in provideRunningDatabase function.
    // For this reason we do not have to generate RunningDatabase again.
    // Dagger knows how to create and use the instance of RunningDatabase
    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRoomDao()




}