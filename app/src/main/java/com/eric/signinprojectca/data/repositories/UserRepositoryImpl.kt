package com.eric.signinprojectca.data.repositories

import com.eric.signinprojectca.data.local.preferences.UserPreferenceData
import com.eric.signinprojectca.domain.repositories.UserRepository
import com.eric.signinprojectca.models.user.UserDataModel
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val preferenceData: UserPreferenceData
) : UserRepository {

    override fun savaData(userDataModel: UserDataModel) {
        preferenceData.apply {
            userEmail = userDataModel.userEmail
            userName = userDataModel.userName
            userAge = userDataModel.userAge
            userPassword = userDataModel.userPassword
        }
    }

    override fun getData(): UserDataModel {
        preferenceData.apply {
            return UserDataModel(
                userName = userName.toString(),
                userAge = userAge.toString(),
                userEmail = userEmail.toString(),
                userPassword = userPassword.toString()
            )
        }
    }
}