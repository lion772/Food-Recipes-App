package com.example.foodrecipesapp.data

import com.example.foodrecipesapp.data.network.FoodRecipesApi
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
        private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>) = foodRecipesApi.getRecipes(queries)

}