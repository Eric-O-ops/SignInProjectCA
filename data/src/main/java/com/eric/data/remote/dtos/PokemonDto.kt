package com.eric.data.remote.dtos

import com.eric.domain.models.pokemon.PokemonDomain
import com.google.gson.annotations.SerializedName

data class PokemonDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

fun PokemonDto.toDomain() = PokemonDomain(
    name = name,
    url = url
)


