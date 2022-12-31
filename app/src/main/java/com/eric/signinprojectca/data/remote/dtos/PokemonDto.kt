package com.eric.signinprojectca.data.remote.dtos

import com.eric.signinprojectca.domain.models.pokemon.PokemonModel
import com.google.gson.annotations.SerializedName

data class PokemonDto(

    @SerializedName("name")
    val name: String,

    @SerializedName("url")
    val url: String
)

fun PokemonDto.toDomain() = PokemonModel(
    name = name,
    url = url
)


