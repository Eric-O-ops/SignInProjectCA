package com.eric.domain.usecases.pokemon

import com.eric.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val pokemonRepository: PokemonRepository
) {

    operator fun invoke() = pokemonRepository.getPokemonList()
}