package com.example.forecastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.forecastapp.databinding.ActivityMainBinding
import com.example.forecastapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        viewModel.weatherResp.observe(this) { weather ->

            binding.apply {

                tvCity.text ="Nairobi"
                tvTemperature.text = weather.temperature
                tvDescription.text = weather.description
                tvWindSpeed.text = weather.wind

            }
        }

    }
}