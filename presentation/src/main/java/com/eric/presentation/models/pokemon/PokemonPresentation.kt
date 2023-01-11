package com.eric.presentation.models.pokemon

import com.eric.domain.models.pokemon.PokemonDomain
import com.eric.presentation.base.BaseDiffUtilItemCallBack

data class PokemonPresentation(
    override val name: String,
    val url: String
) : BaseDiffUtilItemCallBack

fun PokemonDomain.toPresentation() = PokemonPresentation(
    name = name,
    url = url
)

