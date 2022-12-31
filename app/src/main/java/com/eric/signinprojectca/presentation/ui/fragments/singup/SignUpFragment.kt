package com.eric.signinprojectca.presentation.ui.fragments.singup

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.signinprojectca.R
import com.eric.signinprojectca.data.local.models.UserDataModel
import com.eric.signinprojectca.databinding.FragmentSignUpBinding
import com.eric.signinprojectca.navigate
import com.eric.signinprojectca.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment :
    BaseFragment<FragmentSignUpBinding, SignUpViewModel>(R.layout.fragment_sign_up) {

    override val binding by viewBinding(FragmentSignUpBinding::bind)
    override val viewModel: SignUpViewModel by viewModels()

    override fun setupListener() = with(binding) {
        getUserDataBottom.setOnClickListener {
            viewModel.saveUser(
                UserDataModel(
                    userAge = age.text.toString().trim(),
                    userName = name.text.toString().trim(),
                    userEmail = email.text.toString().trim(),
                    userPassword = password.text.toString().trim()
                )
            )
            navigate(R.id.action_signUpFragment_to_userDataFragment)
        }
    }
}