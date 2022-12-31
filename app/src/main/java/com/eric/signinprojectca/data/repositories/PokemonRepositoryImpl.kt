package com.eric.signinprojectca.data.repositories

import com.eric.signinprojectca.data.base.BaseRepository
import com.eric.signinprojectca.data.remote.api.PokemonService
import com.eric.signinprojectca.data.remote.dtos.toDomain
import com.eric.signinprojectca.domain.repositories.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonService
) : BaseRepository(), PokemonRepository {

    override fun getPokemonList() = doRequest {
        pokemonApi.fetchPokemon().results.map {
            it.toDomain()
        }
    }
}