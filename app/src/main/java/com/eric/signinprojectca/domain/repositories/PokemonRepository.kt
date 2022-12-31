package com.eric.signinprojectca.domain.repositories

import com.eric.signinprojectca.common.eithre.Either
import com.eric.signinprojectca.domain.models.pokemon.PokemonModel
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun getPokemonList(): Flow<Either<String, List<PokemonModel>>>
}