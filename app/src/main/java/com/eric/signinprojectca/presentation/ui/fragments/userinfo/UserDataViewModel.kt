package com.eric.signinprojectca.presentation.ui.fragments.userinfo

import androidx.lifecycle.ViewModel
import com.eric.signinprojectca.domain.usecases.GetUserDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserDataViewModel @Inject constructor(
    private val userDataUseCase: GetUserDataUseCase
) : ViewModel() {

    fun getData() = userDataUseCase()
}