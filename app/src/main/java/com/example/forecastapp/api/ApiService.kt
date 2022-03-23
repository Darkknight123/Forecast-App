package com.example.forecastapp.api

interface ApiService {

    @GET("weather/Nairobi")
    suspend fun getWeather():
}