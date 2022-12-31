package com.eric.signinprojectca.presentation.ui.fragments.userinfo

import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.signinprojectca.R
import com.eric.signinprojectca.databinding.FragmentUserDataBinding
import com.eric.signinprojectca.navigate
import com.eric.signinprojectca.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDataFragment :
    BaseFragment<FragmentUserDataBinding, UserDataViewModel>(R.layout.fragment_user_data) {

    override val binding by viewBinding(FragmentUserDataBinding::bind)
    override val viewModel: UserDataViewModel by viewModels()

    override fun setupListener() = with(binding) {

        showView()
        goToPokemonFragment()

    }

    private fun showView() = with(binding) {
        getUserDataBottom.setOnClickListener {
            textHint.visibility = View.GONE
            age.visibility = View.VISIBLE
            email.visibility = View.VISIBLE
            name.visibility = View.VISIBLE
            password.visibility = View.VISIBLE

            viewModel.getData().apply {
                email.text = "email: $userEmail"
                age.text = "age: $userAge"
                password.text = "password: $userPassword"
                name.text = "name: $userName"
            }
        }
    }

    private fun goToPokemonFragment() {
        binding.bottomToPokemonFragment.setOnClickListener {
            navigate(R.id.action_userDataFragment_to_pokemonFragment)
        }
    }
}