package com.eric.signinprojectca.domain.repositories

import com.eric.signinprojectca.data.local.models.UserDataModel

interface UserRepository {

    fun savaData(userModel: UserDataModel)

    fun getData(): UserDataModel
}