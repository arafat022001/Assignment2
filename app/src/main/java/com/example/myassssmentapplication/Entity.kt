package com.example.myassssessmentapplication

import java.io.Serializable

data class Entity(
    val id: Int,
    val name: String,
    val description: String
) : Serializable
