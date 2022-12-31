package com.eric.signinprojectca.data.repositories

import com.eric.signinprojectca.data.local.models.UserDataModel
import com.eric.signinprojectca.data.local.preferences.UserPreferenceData
import com.eric.signinprojectca.domain.models.user.UserModel
import com.eric.signinprojectca.domain.models.user.toDomain
import com.eric.signinprojectca.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val preferenceData: UserPreferenceData
) : UserRepository {

    override fun savaData(userModel: UserDataModel) {
        preferenceData.apply {
            userEmail = userModel.userEmail
            userName = userModel.userName
            userAge = userModel.userAge
            userPassword = userModel.userPassword
        }
    }

    override fun getData(): UserDataModel {
        preferenceData.apply {
            return UserModel(
                userName = userName.toString(),
                userAge = userAge.toString(),
                userEmail = userEmail.toString(),
                userPassword = userPassword.toString()
            ).toDomain()
        }
    }
}