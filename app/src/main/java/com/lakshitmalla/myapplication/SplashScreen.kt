package com.lakshitmalla.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController){
    LaunchedEffect(key1 = null) {
        delay(500)
        navController.navigate("check")
    }
    Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "", modifier = Modifier.fillMaxSize())

}