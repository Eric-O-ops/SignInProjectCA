package com.eric.signinprojectca.domain.models.user

import com.eric.signinprojectca.data.local.models.UserDataModel

data class UserModel(

    val userName: String,

    val userAge: String,

    val userEmail: String,

    val userPassword: String

)

fun UserModel.toDomain() = UserDataModel(
    userName = userName,
    userAge = userAge,
    userEmail = userEmail,
    userPassword = userPassword
)
