package com.eric.signinprojectca.presentation.ui.fragments.singup

import androidx.lifecycle.ViewModel
import com.eric.signinprojectca.data.local.models.UserDataModel
import com.eric.signinprojectca.domain.usecases.user.SaveUserDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val saveUserDataUseCase: SaveUserDataUseCase
) : ViewModel() {

    fun saveUser(userDataModel: UserDataModel) = saveUserDataUseCase(userDataModel)
}