package com.luisenrique.pokedexapp.ui

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.luisenrique.pokedexapp.R
import com.luisenrique.pokedexapp.api.Pokemon
import com.luisenrique.pokedexapp.databinding.ItemPokemonBinding

class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = ItemPokemonBinding.bind(itemView)

    fun bindView(pokemon: Pokemon?, onItemSelected: (Int) -> Unit) = with(itemView) {

        pokemon?.let {
            binding.root.setOnClickListener { onItemSelected(pokemon.id) }

            Glide.with(itemView.context).load(it.imageUrl).into(binding.ivPokemon)

            binding.tvPokemonId.text = "#${pokemon.formattedNumber}"
            binding.tvPokemonName.text = pokemon.formattedName
            binding.tvPokemonType1.text = pokemon.types[0].name.capitalize()

            when(binding.tvPokemonType1.text){
                "Normal" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_normal))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_normal))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_normal)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_normal))
                }
                "Fire" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fire))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fire))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_fire)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fire))
                }
                "Water" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_water))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_water))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_water)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_water))
                }
                "Grass" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_grass))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_grass))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_grass)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_grass))
                }
                "Electric" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_electric))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_electric))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_electric)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_electric))
                }
                "Ice" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ice))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ice))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_ice)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ice))
                }
                "Fighting" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fighting))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fighting))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_fighting)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fighting))
                }
                "Poison" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_poison))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_poison))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_poison)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_poison))
                }
                "Ground" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ground))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ground))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_ground)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ground))
                }
                "Flying" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_flying))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_flying))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_flying)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_flying))
                }
                "Psychic" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_psychic))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_psychic))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_psychic)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_psychic))
                }
                "Bug" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_bug))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_bug))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_bug)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_bug))
                }
                "Rock" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_rock))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_rock))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_rock)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_rock))
                }
                "Ghost" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ghost))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ghost))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_ghost)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_ghost))
                }
                "Dark" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_dark))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_dark))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_dark)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_dark))
                }
                "Dragon" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_dragon))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_dragon))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_dragon)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_dragon))
                }
                "Steel" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_steel))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_steel))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_steel)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_steel))
                }
                "Fairy" -> {
                    binding.cvPokemonType1.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fairy))
                    binding.cvPokemonBackground.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fairy))
                    binding.ivPokemonType1.setImageResource(R.drawable.ic_pokemon_fairy)
                    binding.ivPokemon.setBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_background_fairy))
                }
            }

            if (pokemon.types.size > 1) {
                binding.cvPokemonType2.visibility = View.VISIBLE
                binding.tvPokemonType2.text = pokemon.types[1].name.capitalize()

                when(binding.tvPokemonType2.text){
                    "Normal" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_normal))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_normal)
                    }
                    "Fire" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fire))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_fire)
                    }
                    "Water" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_water))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_water)
                    }
                    "Grass" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_grass))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_grass)
                    }
                    "Electric" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_electric))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_electric)
                    }
                    "Ice" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ice))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_ice)
                    }
                    "Fighting" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fighting))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_fighting)
                    }
                    "Poison" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_poison))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_poison)
                    }
                    "Ground" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ground))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_ground)
                    }
                    "Flying" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_flying))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_flying)
                    }
                    "Psychic" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_psychic))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_psychic)
                    }
                    "Bug" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_bug))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_bug)
                    }
                    "Rock" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_rock))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_rock)
                    }
                    "Ghost" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_ghost))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_ghost)
                    }
                    "Dark" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_dark))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_dark)
                    }
                    "Dragon" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_dragon))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_dragon)
                    }
                    "Steel" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_steel))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_steel)
                    }
                    "Fairy" -> {
                        binding.cvPokemonType2.setCardBackgroundColor(ContextCompat.getColor(context, R.color.pokemon_type_fairy))
                        binding.ivPokemonType2.setImageResource(R.drawable.ic_pokemon_fairy)
                    }
                }
            } else {
                binding.cvPokemonType2.visibility = View.GONE
            }
        }
    }
}