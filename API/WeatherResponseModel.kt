package com.wylan.apps.realtimeweather.API

data class WeatherResponseModel(
    val current: Current,
    val location: Location
)