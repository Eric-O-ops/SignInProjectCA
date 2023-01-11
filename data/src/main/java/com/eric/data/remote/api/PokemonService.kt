package com.eric.data.remote.api

import com.eric.data.remote.dtos.PokemonDto
import com.eric.data.remote.dtos.PokemonResponse
import retrofit2.http.GET

const val END_POINT = "pokemon?limit=10&offset=0"

interface PokemonService {

    @GET(END_POINT)
    suspend fun fetchPokemon(): PokemonResponse<PokemonDto>
}