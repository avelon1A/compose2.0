package com.bosch.composewithkotlin20.presentaion.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bosch.composewithkotlin20.presentaion.ui.theme.Color1
import com.bosch.composewithkotlin20.presentaion.ui.theme.Color2
import kotlinx.serialization.Serializable

@Composable
fun GradientScreen() {
	Column(
		modifier = Modifier.fillMaxSize(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		Button(onClick = { /*TODO*/ }) {
			
		}
		GradientButton(
			text = "Gradient Button",
			textColor = Color.White,
			gradient = Brush.horizontalGradient(
				listOf(
					Color1,
					Color2
				)
			),
			onClick = { click() }
		)
		
		
	}
}

fun click() {
	//todo
}

@Composable
fun GradientButton(
	text: String,
	textColor: Color,
	gradient: Brush,
	onClick: () -> Unit
) {
	Button(

		shape = ButtonDefaults.shape,
		colors = ButtonDefaults.buttonColors(
			containerColor = Color.Transparent
		),
		contentPadding = PaddingValues(16.dp,0.dp),
		onClick = { onClick() }
	) {
		Box(modifier = Modifier
			.background(gradient)
			.padding(horizontal = 16.dp, vertical = 8.dp),
			contentAlignment = Alignment.Center,
		) {
		 Text(text = text , color = textColor)
		}
	}
}
@Preview
@Composable
fun GradientScreenPreview() {
	GradientButton(
		text = " Button",
		textColor = Color.White,
		gradient = Brush.horizontalGradient(
			listOf(
				Color1,
				Color2
			)
		),
		onClick = { click() }
	)
}



@Serializable
object GradientScreen