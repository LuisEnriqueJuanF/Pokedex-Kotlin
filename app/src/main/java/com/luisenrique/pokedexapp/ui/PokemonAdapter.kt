package com.luisenrique.pokedexapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.luisenrique.pokedexapp.R
import com.luisenrique.pokedexapp.api.Pokemon

class PokemonAdapter(
    var items: List<Pokemon?>,
    private val onItemSelected: (Int) -> Unit
) : RecyclerView.Adapter<PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = items[position]
        holder.bindView(pokemon, onItemSelected)
    }

    override fun getItemCount() = items.size
}
