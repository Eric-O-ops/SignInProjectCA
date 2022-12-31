package com.eric.signinprojectca.domain.usecases.user

import com.eric.signinprojectca.data.local.models.UserDataModel
import com.eric.signinprojectca.domain.repositories.UserRepository
import javax.inject.Inject

class SaveUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke(userDataModel: UserDataModel) = userRepository.savaData(userDataModel)
}