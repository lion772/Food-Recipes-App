package com.example.foodrecipesapp.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
        private val remoteDataSource: RemoteDataSource
) {
    var remote: RemoteDataSource = remoteDataSource

}