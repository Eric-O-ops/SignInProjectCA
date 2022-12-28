package com.eric.signinprojectca.di

import com.eric.signinprojectca.data.repositories.UserRepositoryImpl
import com.eric.signinprojectca.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModel {

    @Binds
    fun bindUserRepository(repositoryIml: UserRepositoryImpl): UserRepository
}