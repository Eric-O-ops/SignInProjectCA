package com.eric.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.eric.presentation.base.BaseDiffUtilItemCallBack
import com.eric.presentation.databinding.ItemPokemonBinding
import com.eric.presentation.models.pokemon.PokemonPresentation

class PokemonAdapter :
    ListAdapter<PokemonPresentation, PokemonAdapter.ViewHolder>(BaseDiffUtilItemCallBack.Base()) {

    class ViewHolder(private val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(pokemonDomain: PokemonPresentation) {
            binding.itemPokemonName.text = pokemonDomain.name

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        return ViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}