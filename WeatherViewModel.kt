package com.wylan.apps.realtimeweather

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wylan.apps.realtimeweather.API.APIKey
import com.wylan.apps.realtimeweather.API.NetworkResponse
import com.wylan.apps.realtimeweather.API.RetrofitInstance
import com.wylan.apps.realtimeweather.API.WeatherResponseModel
import kotlinx.coroutines.launch

class WeatherViewModel: ViewModel() {

    private val weatherAPI = RetrofitInstance.weatherAPI
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherResponseModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherResponseModel>> = _weatherResult

    fun getData(city: String) {
        _weatherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response = weatherAPI.getWeather(APIKey.key, city)
                if (response.isSuccessful) {
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                } else {
                    _weatherResult.value = NetworkResponse.Error("Failed to load")
                }
            } catch (e: Exception) {
                _weatherResult.value = NetworkResponse.Error("Failed to load")
            }

        }
    }

}