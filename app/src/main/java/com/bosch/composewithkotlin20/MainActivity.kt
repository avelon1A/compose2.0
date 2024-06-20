package com.bosch.composewithkotlin20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.bosch.composewithkotlin20.ui.AppNavHost
import com.bosch.composewithkotlin20.ui.theme.ComposeWithKotlin20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeWithKotlin20Theme {
                val navController = rememberNavController()
                AppNavHost(navController = navController)
            }
        }
    }
}

