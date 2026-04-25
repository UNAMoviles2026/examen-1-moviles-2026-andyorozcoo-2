package com.moviles.examenmoviles.model

data class CoworkingSpace(
    val id: Int,
    val name: String,
    val description: String,
    val location: String,
    val capacity: Int,
    val pricePerHour: Double,
    val isAvailable: Boolean,
    val imageUrl: String = "https://images.unsplash.com/photo-1527192491265-7e15c55b1ed2?q=80&w=1000&auto=format&fit=crop"
)
