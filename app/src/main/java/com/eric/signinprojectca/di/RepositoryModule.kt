package com.eric.signinprojectca.di

import com.eric.data.repositories.PokemonRepositoryImpl
import com.eric.domain.repositories.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindPokemonRepository(repository: PokemonRepositoryImpl): PokemonRepository
}