package com.bosch.composewithkotlin20.data.model.request

data class LoginRequest(
	val username: String,
	val password: String,
	val expiresInMins: Int = 30
)