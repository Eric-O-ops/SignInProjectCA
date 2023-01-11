package com.eric.domain.repositories

import com.eric.domain.either.Either
import com.eric.domain.models.pokemon.PokemonDomain
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun getPokemonList(): Flow<Either<String, List<PokemonDomain>>>
}