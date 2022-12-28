package com.eric.signinprojectca.data.local.preferences

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(context: Context) {

    private val preference = context.getSharedPreferences("userData", Context.MODE_PRIVATE)

    operator fun invoke(): SharedPreferences = preference
}