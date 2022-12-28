package com.eric.signinprojectca.data.local.preferences

class UserPreferenceData(
    private val preferenceHelper: PreferenceHelper
) {
    var userName: String?
        get() = preferenceHelper().getString(
            PreferenceConstances.USER_NAME, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstances.USER_NAME, value
        ).apply()

    var userAge: String?
        get() = preferenceHelper().getString(
            PreferenceConstances.USER_AGE, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstances.USER_AGE, value
        ).apply()

    var userEmail: String?
        get() = preferenceHelper().getString(
            PreferenceConstances.USER_EMAIL, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstances.USER_EMAIL, value
        ).apply()

    var userPassword: String?
        get() = preferenceHelper().getString(
            PreferenceConstances.USER_PASSWORD, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstances.USER_PASSWORD, value
        ).apply()
}