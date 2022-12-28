package com.eric.signinprojectca.presentation.ui.fragments.userinfo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.signinprojectca.R
import com.eric.signinprojectca.databinding.FragmentUserDataBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDataFragment : Fragment(R.layout.fragment_user_data) {

    private val binding by viewBinding(FragmentUserDataBinding::bind)
    private val viewModel: UserDataViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListener()
    }

    private fun setupListener() = with(binding) {
        getUserDataBottom.setOnClickListener {
            binding.textHint.visibility = View.GONE
            binding.age.visibility = View.VISIBLE
            binding.email.visibility = View.VISIBLE
            binding.name.visibility = View.VISIBLE
            binding.password.visibility = View.VISIBLE

            viewModel.getData().apply {
                email.text = "email: $userEmail"
                age.text = "age: $userAge"
                password.text = "password: $userPassword"
                name.text = "name: $userName"
            }
        }
    }
}