package com.eric.signinprojectca.presentation.ui.fragments.pokemon

import androidx.lifecycle.ViewModel
import com.eric.signinprojectca.domain.usecases.GetPokemonDataUseCaseBaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonUseCase: GetPokemonDataUseCaseBaseRepository
) : ViewModel() {

    fun getPokemonList() = getPokemonUseCase()
}