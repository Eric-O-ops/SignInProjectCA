package com.eric.signinprojectca.presentation.ui.fragments.singup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.signinprojectca.R
import com.eric.signinprojectca.databinding.FragmentSignUpBinding
import com.eric.signinprojectca.models.user.UserDataModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private val binding by viewBinding(FragmentSignUpBinding::bind)
    private val viewModel: SignUpViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() = with(binding) {
        getUserDataBottom.setOnClickListener {
            viewModel.saveUser(UserDataModel(
                userAge = age.text.toString().trim(),
                userName = name.text.toString().trim(),
                userEmail = email.text.toString().trim(),
                userPassword = password.text.toString().trim()
            ))
            findNavController().navigate(
                R.id.action_signUpFragment_to_userDataFragment
            )
        }
    }
}