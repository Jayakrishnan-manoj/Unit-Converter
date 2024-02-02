package com.example.unit_converter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class MyViewModel : ViewModel() {
    var tempC by mutableStateOf(0)

    fun convertTemp(tempF: String) {
        var tempNum = tempF.toInt();
        tempC = ((tempNum - 32) * 0.5556).roundToInt()
    }

}
