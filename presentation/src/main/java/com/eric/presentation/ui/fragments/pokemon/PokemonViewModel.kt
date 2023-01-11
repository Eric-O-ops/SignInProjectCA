package com.eric.presentation.ui.fragments.pokemon

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonUseCase: com.eric.domain.usecases.pokemon.GetPokemonListUseCase
) : ViewModel() {

    fun getPokemonList() = getPokemonUseCase()
}