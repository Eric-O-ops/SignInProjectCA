package com.eric.signinprojectca.data.local.models

import com.eric.signinprojectca.domain.models.user.UserModel

data class UserDataModel(

    val userName: String,

    val userAge: String,

    val userEmail: String,

    val userPassword: String
)

fun UserDataModel.toDomain() = UserModel(
    userName = userName,
    userAge = userAge,
    userEmail = userEmail,
    userPassword = userPassword
)
