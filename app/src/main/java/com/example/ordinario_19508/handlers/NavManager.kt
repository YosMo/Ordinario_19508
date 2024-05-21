package com.example.ordinario_19508.handlers

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ordinario_19508.views.AdivinaEdad
import com.example.ordinario_19508.views.EdadCalculada
import com.example.ordinario_19508.views.ListView



@ExperimentalMaterial3Api
@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        composable(route = "ListView") {
            ListView(navController)
        }
        composable(route = "Edad") {
            EdadCalculada(navController)
        }
        composable(route = "Adivina") {
            AdivinaEdad(navController)
        }

    }
}