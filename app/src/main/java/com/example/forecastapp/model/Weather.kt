package com.example.forecastapp.model

data class Weather(
    val description: String,
    val forecast:List<Forecast>,
    val temperature:String,
    val wind:String
)