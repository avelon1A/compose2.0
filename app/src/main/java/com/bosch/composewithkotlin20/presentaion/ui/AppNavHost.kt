package com.bosch.composewithkotlin20.presentaion.ui


import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bosch.composewithkotlin20.presentaion.ui.screen.*

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeScreen,
        modifier = Modifier.padding(top = 50.dp)
    ) {
        composable<HomeScreen> {
            HomeScreen(navController = navController)
        }
        composable<ScreenB> {
            ScreenB(navController = navController)
        }
        composable<ScreenC> {
            ScreenC(navController = navController)
        }
        composable<ThirdScreen> {
            ThirdScreen(navController = navController)
        }
        composable<TextScreen> {
            TextScreen()
        }
        composable<TextSelectable> {
            TextSelectable()
        }
        composable<TextField> {
            TextField()
        }
        composable<GoogleButtonScreen> {
            GoogleButtonScreen()
        }
        composable<CoilScreen> {
            CoilScreen()
        }
        composable<GradientScreen> {
            GradientScreen()
        }
        composable<CameraScreen> {
            CameraScreen()
        }
        composable<LoginScreen> {
            LoginScreen()
        }
        
    }
}

