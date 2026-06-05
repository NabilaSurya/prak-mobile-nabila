package com.example.nabeeyaps.data.api

import com.example.nabeeyaps.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}