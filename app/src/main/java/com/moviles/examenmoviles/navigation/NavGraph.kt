package com.moviles.examenmoviles.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.moviles.examenmoviles.screens.SpaceDetailScreen
import com.moviles.examenmoviles.screens.SpaceListScreen
import com.moviles.examenmoviles.viewmodel.CoworkingSpaceViewModel

@Composable
fun NavGraph(navController: NavHostController) {
    val viewModel: CoworkingSpaceViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.SpaceList.route
    ) {
        // Space List Screen
        composable(route = Screen.SpaceList.route) {
            SpaceListScreen(
                viewModel = viewModel,
                onSpaceClick = { spaceId ->
                    navController.navigate(Screen.SpaceDetail.createRoute(spaceId))
                }
            )
        }

        // Space Detail Screen
        composable(
            route = Screen.SpaceDetail.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getInt("id") ?: 0
            SpaceDetailScreen(
                spaceId = spaceId,
                viewModel = viewModel,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
