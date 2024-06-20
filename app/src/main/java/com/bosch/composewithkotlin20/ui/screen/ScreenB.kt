package com.example.kotin2
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import kotlinx.serialization.Serializable

@Composable
fun ScreenB(args: ScreenB,navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "${args.name} is ${args.age} years old")
        Button(onClick = {
            navController.navigate(ScreenC)
        }) {
            Text(text = "go to third Screen")

        }
    }
}

@Serializable
data class ScreenB(
    val name: String?,
    val age: Int
)
