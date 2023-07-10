package com.luisenrique.pokedexapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.luisenrique.pokedexapp.R
import com.luisenrique.pokedexapp.databinding.ActivityPokemonDetailBinding
import com.luisenrique.pokedexapp.viewmodel.PokemonDetailViewModel

class PokemonDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: PokemonDetailViewModel
    private lateinit var binding: ActivityPokemonDetailBinding

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PokemonDetailViewModel::class.java]

        Handler(Looper.getMainLooper()).postDelayed({
            createUI()
        },1000)
    }

    fun createUI() {
        val id = intent.extras?.get("extra_id") as Int

        binding.PokemonDetailBackgroundLoading.isVisible = false
        binding.PokemonDetailBackgroundBottomLoading.isVisible = false
        binding.PokemonDetailBackground.isVisible = true
        binding.PokemonDetailBackgroundBottom.isVisible = true

        viewModel.getPokemonInfo(id)
        viewModel.pokemonInfo.observe(this, Observer { pokemon ->
            val formattedNumber = pokemon.id.toString().padStart(3, '0')

            Glide.with(this).load("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png").into(binding.ivPokemonDetail)

            binding.tvPokemonDetailId.text = "#${formattedNumber}"
            binding.tvPokemonDetailName.text = pokemon.name.capitalize()
            binding.tvPokemonDetailType1.text = pokemon.types[0].type.name.capitalize()

            when(binding.tvPokemonDetailType1.text){
                "Normal" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_normal))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_normal))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_normal)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_normal))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_normal))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_normal))
                }
                "Fire" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fire))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fire))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_fire)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fire))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fire))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fire))
                }
                "Water" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_water))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_water))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_water)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_water))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_water))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_water))
                }
                "Grass" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_grass))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_grass))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_grass)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_grass))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_grass))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_grass))
                }
                "Electric" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_electric))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_electric))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_electric)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_electric))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_electric))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_electric))
                }
                "Ice" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ice))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ice))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_ice)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ice))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ice))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ice))
                }
                "Fighting" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fighting))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fighting))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_fighting)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fighting))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fighting))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fighting))
                }
                "Poison" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_poison))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_poison))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_poison)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_poison))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_poison))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_poison))
                }
                "Ground" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ground))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ground))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_ground)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ground))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ground))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ground))
                }
                "Flying" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_flying))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_flying))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_flying)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_flying))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_flying))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_flying))
                }
                "Psychic" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_psychic))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_psychic))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_psychic)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_psychic))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_psychic))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_psychic))
                }
                "Bug" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_bug))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_bug))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_bug)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_bug))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_bug))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_bug))
                }
                "Rock" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_rock))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_rock))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_rock)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_rock))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_rock))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_rock))
                }
                "Ghost" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ghost))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ghost))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_ghost)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ghost))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_ghost))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_ghost))
                }
                "Dark" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_dark))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_dark))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_dark)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_dark))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_dark))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_dark))
                }
                "Dragon" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_dragon))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_dragon))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_dragon)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_dragon))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_dragon))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_dragon))
                }
                "Steel" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_steel))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_steel))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_steel)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_steel))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_steel))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_steel))
                }
                "Fairy" -> {
                    binding.cvPokemonDetailType1.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fairy))
                    binding.PokemonDetailBackground.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fairy))
                    binding.ivPokemonDetailType1.setImageResource(R.drawable.ic_pokemon_fairy)
                    binding.tvPokedexData.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fairy))
                    binding.tvTitlePokemonDescription.setTextColor(ContextCompat.getColor(this, R.color.pokemon_type_fairy))
                    binding.ivPokemonDetail.setBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_background_fairy))
                }
            }

            if (pokemon.types.size > 1) {
                binding.cvPokemonDetailType2.visibility = View.VISIBLE
                binding.tvPokemonDetailType2.text = pokemon.types[1].type.name.capitalize()

                when(binding.tvPokemonDetailType2.text){
                    "Normal" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_normal))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_normal)
                    }
                    "Fire" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fire))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_fire)
                    }
                    "Water" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_water))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_water)
                    }
                    "Grass" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_grass))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_grass)
                    }
                    "Electric" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_electric))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_electric)
                    }
                    "Ice" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ice))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_ice)
                    }
                    "Fighting" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fighting))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_fighting)
                    }
                    "Poison" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_poison))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_poison)
                    }
                    "Ground" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ground))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_ground)
                    }
                    "Flying" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_flying))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_flying)
                    }
                    "Psychic" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_psychic))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_psychic)
                    }
                    "Bug" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_bug))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_bug)
                    }
                    "Rock" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_rock))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_rock)
                    }
                    "Ghost" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_ghost))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_ghost)
                    }
                    "Dark" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_dark))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_dark)
                    }
                    "Dragon" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_dragon))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_dragon)
                    }
                    "Steel" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_steel))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_steel)
                    }
                    "Fairy" -> {
                        binding.cvPokemonDetailType2.setCardBackgroundColor(ContextCompat.getColor(this, R.color.pokemon_type_fairy))
                        binding.ivPokemonDetailType2.setImageResource(R.drawable.ic_pokemon_fairy)
                    }
                }
            } else {
                binding.cvPokemonDetailType2.visibility = View.GONE
            }

            binding.tvPokemonDetailBaseExp.text = "${pokemon.baseExperience} xp"
            binding.tvPokemonDetailHeight.text = "${pokemon.height / 10.0} m"
            binding.tvPokemonDetailWeight.text = "${pokemon.weight /10.0} kg"
        })

        viewModel.getPokemonDescription(id)
        viewModel.pokemonDescription.observe(this) { pokemon ->
            val englishFlavorEntries = pokemon.flavorTextEntries.filter { it.language.name == "en" }
            val englishGenusEntries = pokemon.genera.filter { it.language.name == "en" }

            val englishFlavorText = englishFlavorEntries.firstOrNull()?.flavorText
            val englishGenusText = englishGenusEntries.firstOrNull()?.genus

            val formattedEnglishFlavorText = englishFlavorText?.replace("\n", " ")

            binding.tvPokemonDescription.text = formattedEnglishFlavorText ?: ""
            binding.tvPokemonDetailSpecies.text = englishGenusText ?: ""

            viewModel.pokemonInfo.value?.englishFlavorTextEntries =
                englishFlavorEntries.map { it.flavorText }
            viewModel.pokemonInfo.value?.englishGenusEntries =
                englishGenusEntries.map { it.genus }
        }
    }
}