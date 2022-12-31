package com.eric.signinprojectca.domain.usecases.user

import com.eric.signinprojectca.domain.repositories.UserRepository
import javax.inject.Inject

class GetUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke() = userRepository.getData()
}