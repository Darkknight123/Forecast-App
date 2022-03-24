package com.example.forecastapp.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Nairobi")
    suspend fun getWeather(): Response<Weather>
}