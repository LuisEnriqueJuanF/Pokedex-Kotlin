package com.luisenrique.pokedexapp.api

import com.google.gson.annotations.SerializedName

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)

data class PokemonResult(
    val name: String,
    val url: String
)

data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: List<PokemonTypeSlot>,
    @SerializedName("base_experience") val baseExperience: Int,
    val height: Int,
    val weight: Int,
    @SerializedName("flavor_text_entries")val flavorTextEntries: List<FlavorTextEntry>,
    val species: Species,
    val genera: List<Genus>,
    var englishFlavorTextEntries: List<String> = emptyList(),
    var englishGenusEntries: List<String> = emptyList()
)

data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)

data class Species(
    val name: String,
    val url: String
)

data class FlavorTextEntry(
    @SerializedName("flavor_text")val flavorText: String,
    val language: Language
)

data class Language(
    val name: String,
    val url: String
)

data class Genus(
    val genus: String,
    val language: Language
)