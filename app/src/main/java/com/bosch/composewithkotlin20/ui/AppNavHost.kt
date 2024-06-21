package com.bosch.composewithkotlin20.ui


import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bosch.composewithkotlin20.ui.screen.ScreenB
import com.bosch.composewithkotlin20.ui.screen.ScreenC
import com.bosch.composewithkotlin20.ui.screen.home.HomeScreen


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeScreen,
        modifier = Modifier.padding(top = 100.dp)
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
    }
}

