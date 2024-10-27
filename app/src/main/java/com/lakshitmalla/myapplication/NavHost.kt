package com.lakshitmalla.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHost() {
    var navController = rememberNavController()
    NavHost(startDestination = "", navController = navController) {
        composable("splash") {
            Splash(navController)
        }
        composable("check") {
            if (logonState == true) {
                navController.navigate("home")
            } else {
                navController.navigate("login")
            }
        }
        composable("login") {

        }
        composable("home") {

        }
    }
}