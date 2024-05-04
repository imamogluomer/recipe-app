package com.omerimamoglu.myrecipeapp

sealed class Screen (val route:String){

    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreeen")




}