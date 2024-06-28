package com.bosch.composewithkotlin20.presentaion.ui.screen
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bosch.composewithkotlin20.presentaion.ui.viewModel.LoginViewModel
import androidx.compose.material3.TextField
import com.bosch.composewithkotlin20.data.model.response.LoginResponse
import com.bosch.composewithkotlin20.util.ApiState
import kotlinx.serialization.Serializable

@Composable
fun LoginScreen(viewModel: LoginViewModel = hiltViewModel()) {
	val username by viewModel.username.collectAsState()
	val password by viewModel.password.collectAsState()
	val loginState by viewModel.loginState.collectAsState()
	
	Column(
		modifier = Modifier.fillMaxSize().padding(16.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		TextField(
			value = username,
			onValueChange = { viewModel.onUsernameChanged(it) },
			label = { Text("Username") },
			modifier = Modifier.fillMaxWidth()
		)
		
		Spacer(modifier = Modifier.height(8.dp))
		
		TextField(
			value = password,
			onValueChange = { viewModel.onPasswordChanged(it) },
			label = { Text("Password") },
			visualTransformation = PasswordVisualTransformation(),
			modifier = Modifier.fillMaxWidth()
		)
		
		Spacer(modifier = Modifier.height(16.dp))
		
		Button(onClick = { viewModel.login() }) {
			Text("Login")
		}
		
		Spacer(modifier = Modifier.height(16.dp))
		
		when (loginState) {
			is ApiState.Loading -> {
				CircularProgressIndicator()
			}
			is ApiState.Success -> {
				Text("Login Successful: ${(loginState as ApiState.Success<LoginResponse>).data.username}")
			}
			is ApiState.Failure -> {
				Text("Login Failed")
			}
			is ApiState.Error -> {
				Text("Error: ${(loginState as ApiState.Error).message}")
			}
			else ->{
			
			}
			
			
		}
	}
}
@Serializable
object LoginScreen

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
	LoginScreen()
}
