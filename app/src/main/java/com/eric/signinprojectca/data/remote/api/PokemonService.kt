package com.eric.signinprojectca.data.remote.api

import com.eric.signinprojectca.data.remote.dtos.PokemonDto
import com.eric.signinprojectca.data.remote.dtos.PokemonResponse
import retrofit2.http.GET

interface PokemonService {

    @GET("pokemon?limit=10&offset=0")
    suspend fun fetchPokemon(): PokemonResponse<PokemonDto>
}