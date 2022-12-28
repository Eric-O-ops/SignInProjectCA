package com.eric.signinprojectca.domain.repositories

import com.eric.signinprojectca.models.user.UserDataModel

interface UserRepository {

    fun savaData(userDataModel: UserDataModel)

    fun getData(): UserDataModel
}