package com.bosch.composewithkotlin20.data.repo

import com.bosch.composewithkotlin20.data.api.ApiService
import com.bosch.composewithkotlin20.data.model.request.LoginRequest
import com.bosch.composewithkotlin20.data.model.response.LoginResponse
import javax.inject.Inject

class LoginRepository @Inject constructor(
	private val apiService: ApiService
) {
	suspend fun login(username: String, password: String): LoginResponse? {
	val request = 	LoginRequest(username,password)
		return try {
			val response = apiService.login(request)
			if(response.isSuccessful){
				response.body()
			}
			else{
				null
			}
		} catch (e: Exception) {
			null
		}
	}
}
