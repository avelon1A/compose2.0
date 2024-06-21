package com.bosch.composewithkotlin20.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bosch.composewithkotlin20.ui.screen.ScreenB
import com.bosch.composewithkotlin20.ui.screen.ScreenC
import kotlinx.serialization.Serializable

@Composable
fun HomeScreen(navController: NavController) {
    val buttonList = listOf(
        ButtonInfo("first ", ScreenB),
        ButtonInfo("Second", ScreenC),

    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(buttonList.size) { buttonInfo  ->
                Button(onClick = {
                        navController.navigate(buttonList[buttonInfo].route)
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = buttonList[buttonInfo].title )
                }
            }
        }
    }
}

data class ButtonInfo(val title: String, val route: Any)


@Serializable
object HomeScreen