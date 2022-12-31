package com.eric.signinprojectca.domain.usecases

import com.eric.signinprojectca.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonDataUseCaseBaseRepository @Inject constructor(
    private val pokemonRepository: PokemonRepository
) {

    operator fun invoke() = pokemonRepository.getPokemonList()
}