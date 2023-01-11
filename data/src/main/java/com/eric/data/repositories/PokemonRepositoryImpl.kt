package com.eric.data.repositories

import com.eric.data.base.BaseRepository
import com.eric.data.remote.api.PokemonService
import com.eric.data.remote.dtos.toDomain
import com.eric.domain.repositories.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonService
) : BaseRepository(), PokemonRepository {

    override fun getPokemonList() = doRequest {
        pokemonApi.fetchPokemon().results.map { pokemonDto ->
            pokemonDto.toDomain()
        }
    }
}