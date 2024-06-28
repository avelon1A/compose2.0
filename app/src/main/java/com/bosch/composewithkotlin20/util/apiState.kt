package com.bosch.composewithkotlin20.util

sealed class ApiState<out T> {
	data object Initial : ApiState<Nothing>()
	data object Loading : ApiState<Nothing>()
	data class Success<out T>(val data: T) : ApiState<T>()
	data object Failure : ApiState<Nothing>()
	data class Error(val message: String) : ApiState<Nothing>()
}