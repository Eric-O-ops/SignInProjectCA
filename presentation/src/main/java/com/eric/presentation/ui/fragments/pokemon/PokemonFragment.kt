package com.eric.presentation.ui.fragments.pokemon

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.presentation.R
import com.eric.presentation.base.BaseFragment
import com.eric.presentation.databinding.FragmentPokemonBinding
import com.eric.presentation.models.pokemon.toPresentation
import com.eric.presentation.ui.adapters.PokemonAdapter
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
            left = { error ->
                Log.e("TAG", error)
            },
            right = { data ->
                pokemonAdapter.submitList(data.map { pokemonDomain ->
                    pokemonDomain.toPresentation()
                })
            })
    }
}