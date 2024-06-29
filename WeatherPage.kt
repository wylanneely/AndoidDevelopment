package com.wylan.apps.realtimeweather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun WeatherPage() {

    var city by remember {
        mutableStateOf("")
    }

    Column { 
        Row {
            OutlinedTextField(value = city
                , onValueChange = {city = it},
                label = {
                    Text(text = "Search for any location")
                })
        }
        
    }
}