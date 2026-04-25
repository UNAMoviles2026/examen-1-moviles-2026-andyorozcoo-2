package com.moviles.examenmoviles.navigation

sealed class Screen(val route: String) {
    object SpaceList : Screen("spaces")
    object SpaceDetail : Screen("space_detail/{id}") {
        fun createRoute(id: Int) = "space_detail/$id"
    }
}
