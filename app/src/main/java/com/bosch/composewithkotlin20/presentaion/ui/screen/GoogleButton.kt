package com.bosch.composewithkotlin20.presentaion.ui.screen

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.*
import androidx.compose.ui.unit.*
import com.bosch.composewithkotlin20.R
import kotlinx.serialization.*

@Composable
fun GoogleButtonScreen() {
	
	Column(
		modifier = Modifier.fillMaxSize(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		GoogleButton()
		
	}
	
}

@Composable
fun GoogleButton() {
	var clicked by remember { mutableStateOf(false) }
	Surface(
		modifier = Modifier.height(48.dp),
		onClick = { clicked = !clicked },
		shape = Shapes().small,
		border = BorderStroke(width = 1.dp, color = Color.LightGray),
		color = MaterialTheme.colorScheme.surface,
	) {
		Row(
			modifier = Modifier
				.padding(start = 12.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
				.animateContentSize(animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)),
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center,
			
			) {
			Icon(
				painter = painterResource(id = R.drawable.google_icon),
				contentDescription = "googleIcon",
				tint = Color.Unspecified,
			)
			Text(text = "Sign in with Google")
			if (clicked) {
				Spacer(modifier = Modifier.width(16.dp))
				CircularProgressIndicator(
					modifier = Modifier
						.height(16.dp)
						.width(16.dp),
					strokeWidth = 2.dp,
					color = MaterialTheme.colorScheme.primary
				)
			}
		}
		
	}
}

@Serializable
object GoogleButtonScreen