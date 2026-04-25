package com.moviles.examenmoviles.data

import com.moviles.examenmoviles.model.CoworkingSpace

object MockData {
    val coworkingSpaces = listOf(
        CoworkingSpace(
            id = 1,
            name = "Creative Room",
            description = "A comfortable and quiet space perfect for deep work and creative sessions. Equipped with high-speed internet and ergonomic chairs.",
            location = "San José, Costa Rica",
            capacity = 8,
            pricePerHour = 10.0,
            isAvailable = true,
            imageUrl = "https://images.unsplash.com/photo-1527192491265-7e15c55b1ed2?q=80&w=1000&auto=format&fit=crop"
        ),
        CoworkingSpace(
            id = 2,
            name = "Tech Hub",
            description = "Modern space designed for developers and tech teams. Features multiple monitors and a collaborative environment.",
            location = "Heredia, Costa Rica",
            capacity = 12,
            pricePerHour = 15.0,
            isAvailable = true,
            imageUrl = "https://images.unsplash.com/photo-1497366216548-37526070297c?q=80&w=1000&auto=format&fit=crop"
        ),
        CoworkingSpace(
            id = 3,
            name = "Zen Workspace",
            description = "Minimalist and peaceful workspace for those who need focus and tranquility. Includes a small lounge area.",
            location = "Escazú, Costa Rica",
            capacity = 5,
            pricePerHour = 12.0,
            isAvailable = false,
            imageUrl = "https://images.unsplash.com/photo-1519389950473-47ba0277781c?q=80&w=1000&auto=format&fit=crop"
        ),
        CoworkingSpace(
            id = 4,
            name = "Skyline Office",
            description = "Premium office space with a stunning view of the city. Ideal for executive meetings and high-profile clients.",
            location = "San José, Costa Rica",
            capacity = 10,
            pricePerHour = 25.0,
            isAvailable = true,
            imageUrl = "https://images.unsplash.com/photo-1497215728101-856f4ea42174?q=80&w=1000&auto=format&fit=crop"
        )
    )
}
