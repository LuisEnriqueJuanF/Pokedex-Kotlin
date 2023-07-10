package com.luisenrique.pokedexapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luisenrique.pokedexapp.api.ApiService
import com.luisenrique.pokedexapp.api.PokemonApiResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokemonDetailViewModel : ViewModel() {

    val retrofit = Retrofit
        .Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(ApiService::class.java)

    val pokemonInfo = MutableLiveData<PokemonApiResult>()
    val pokemonDescription = MutableLiveData<PokemonApiResult>()

    fun getPokemonInfo(id: Int) {
        val call = service.getPokemon(id)

        call.enqueue(object : Callback<PokemonApiResult> {
            override fun onResponse(
                call: Call<PokemonApiResult>,
                response: Response<PokemonApiResult>
            ) {
                response.body()?.let { pokemon ->
                    pokemonInfo.postValue(pokemon)
                }
            }

            override fun onFailure(call: Call<PokemonApiResult>, t: Throwable) {
                call.cancel()
            }
        })
    }

    fun getPokemonDescription(id: Int) {
        val callDescription = service.getPokemonSpecies(id)

        callDescription.enqueue(object : Callback<PokemonApiResult> {
            override fun onResponse(
                call: Call<PokemonApiResult>,
                response: Response<PokemonApiResult>
            ) {
                response.body()?.let { pokemon ->
                    pokemonDescription.postValue(pokemon)
                }
            }

            override fun onFailure(call: Call<PokemonApiResult>, t: Throwable) {
                call.cancel()
            }
        })
    }
}