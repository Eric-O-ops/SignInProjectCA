package com.eric.signinprojectca.presentation.ui.fragments.pokemon

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.signinprojectca.R
import com.eric.signinprojectca.databinding.FragmentPokemonBinding
import com.eric.signinprojectca.loge
import com.eric.signinprojectca.presentation.base.BaseFragment
import com.eric.signinprojectca.presentation.ui.adapters.PokemonAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokemonFragment :
    BaseFragment<FragmentPokemonBinding, PokemonViewModel>(R.layout.fragment_pokemon) {

    override val binding by viewBinding(FragmentPokemonBinding::bind)
    override val viewModel: PokemonViewModel by viewModels()
    private var pokemonAdapter = PokemonAdapter()

    override fun initialize() {
        binding.pokemonRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = pokemonAdapter
        }
    }

    override fun setupSubscribes() {
        viewModel.getPokemonList().subscribe(
            onError = { error ->
                loge("TAG", error)
            },
            onSuccess = { data ->
                pokemonAdapter.setupList(data)
            }
        )
    }
}