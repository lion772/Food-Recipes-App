package com.example.foodrecipesapp.models


import com.google.gson.annotations.SerializedName

data class ExtendedIngredient(
        @SerializedName("amount")
        val amount: Double,
        @SerializedName("consistency")
        val consistency: Double,
        @SerializedName("image")
        val image: String,
        @SerializedName("original")
        val original: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("unit")
        val unit: String
)