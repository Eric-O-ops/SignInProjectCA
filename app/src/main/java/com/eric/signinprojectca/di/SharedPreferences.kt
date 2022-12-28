package com.eric.signinprojectca.di

import android.content.Context
import com.eric.signinprojectca.data.local.preferences.PreferenceHelper
import com.eric.signinprojectca.data.local.preferences.UserPreferenceData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferences {

    @Provides
    @Singleton
    fun providePreferenceHelper(@ApplicationContext context: Context): PreferenceHelper {
        return PreferenceHelper(context)
    }

    @Provides
    @Singleton
    fun provideUserPreferenceData(preferenceHelper: PreferenceHelper): UserPreferenceData {
        return UserPreferenceData(preferenceHelper)
    }
}