package com.bosch.composewithkotlin20.ui


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.bosch.composewithkotlin20.ui.screen.home.ScreenA
import com.example.kotin2.ScreenB
import com.example.kotin2.ScreenC


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = ScreenA
    ) {
        composable<ScreenA> {
            ScreenA(navController = navController)
        }
        composable<ScreenB> {
            val args = it.toRoute<ScreenB>()
            ScreenB(args = args,navController)
        }
        composable<ScreenC> {
            ScreenC(navController = navController)
        }
    }
}

