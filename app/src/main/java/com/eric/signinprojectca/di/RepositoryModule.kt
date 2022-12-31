package com.eric.signinprojectca.di

import com.eric.signinprojectca.data.repositories.PokemonRepositoryImpl
import com.eric.signinprojectca.data.repositories.UserRepositoryImpl
import com.eric.signinprojectca.domain.repositories.PokemonRepository
import com.eric.signinprojectca.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindUserRepository(repositoryIml: UserRepositoryImpl): UserRepository

    @Binds
    fun bindPokemonRepository(repository: PokemonRepositoryImpl): PokemonRepository
}