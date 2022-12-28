package com.eric.signinprojectca.domain.usecases

import com.eric.signinprojectca.domain.repositories.UserRepository
import com.eric.signinprojectca.models.user.UserDataModel
import javax.inject.Inject

class SaveUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke(userDataModel: UserDataModel) = userRepository.savaData(userDataModel)
}