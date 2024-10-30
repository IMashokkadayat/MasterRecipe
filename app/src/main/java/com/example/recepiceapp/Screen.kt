package com.example.recepiceapp

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipe_screen")
    object DetailsScreen : Screen("category_details_screen")
}