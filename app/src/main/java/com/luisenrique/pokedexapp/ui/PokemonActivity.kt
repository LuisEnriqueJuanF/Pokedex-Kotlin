package com.luisenrique.pokedexapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.luisenrique.pokedexapp.databinding.ActivityPokemonBinding
import com.luisenrique.pokedexapp.api.Pokemon
import com.luisenrique.pokedexapp.ui.PokemonDetailActivity.Companion.EXTRA_ID
import com.luisenrique.pokedexapp.viewmodel.PokemonViewModel
import com.luisenrique.pokedexapp.viewmodel.PokemonViewModelFactory


class PokemonActivity : AppCompatActivity() {

    lateinit var binding: ActivityPokemonBinding

    private val recyclerView by lazy {
        binding.rvPokemon
    }

    private val viewModel by lazy {
        ViewModelProvider(this, PokemonViewModelFactory()).get(PokemonViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            viewModel.pokemons.observe(this, Observer {
                loadRecyclerView(it)
            })
        }, 1000)
    }

    private fun loadRecyclerView(pokemons: List<Pokemon?>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PokemonAdapter(pokemons) { navigateToDetail(it) }
        binding.viewLoading.isVisible = false
        binding.rvPokemon.isVisible = true

        binding.svFilter.addTextChangedListener { userFilter ->
            val pokemonNameFiltered = pokemons.filter { pokemon ->

                if (isNumericToX(userFilter.toString())) {
                    pokemon?.id.toString().contains(userFilter.toString())
                }else{
                    pokemon?.name.toString().contains(userFilter.toString().lowercase())

                }
            }
            recyclerView.adapter = PokemonAdapter(pokemonNameFiltered) { navigateToDetail(it) }
        }
    }

    fun isNumericToX(toCheck: String): Boolean {
        return toCheck.toDoubleOrNull() != null
    }

    private fun navigateToDetail(id: Int) {
        val intent = Intent(this, PokemonDetailActivity::class.java)
        intent.putExtra(EXTRA_ID, id)
        startActivity(intent)
    }
}
