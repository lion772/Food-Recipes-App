package com.example.foodrecipesapp

import retrofit2.http.QueryMap
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
        private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>) = foodRecipesApi.getRecipes(queries)

}