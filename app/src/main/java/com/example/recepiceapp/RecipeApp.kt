package com.example.recepiceapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController) {
    val recipeViewModel: MainViewModel = viewModel()
    val viewstate by recipeViewModel.categoryState

    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(viewstate = viewstate, navigateToDetail = {
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    "cat",
                    it
                ) // hellps to pass data to one to next screen

                navController.navigate(Screen.DetailsScreen.route)
            })
        }
        composable(route = Screen.DetailsScreen.route) {
            val category =
                navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")
                    ?: Category("", "", "", "")
            CategoryDetailsScreen(category = category)
        }

    }
}