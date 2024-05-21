package com.example.ordinario_19508.models

import androidx.annotation.DrawableRes

data class Person(
    val number: Int,
    val title: String,
    @DrawableRes val image: Int
)
