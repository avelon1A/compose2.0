package com.bosch.composewithkotlin20.di

import com.bosch.composewithkotlin20.data.api.ApiService
import com.bosch.composewithkotlin20.data.repo.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
	
	@Provides
	@Singleton
	fun provideRetrofit(): Retrofit {
		return Retrofit.Builder()
			.baseUrl("https://dummyjson.com/")
			.addConverterFactory(GsonConverterFactory.create())
			.build()
	}
	
	@Provides
	@Singleton
	fun provideApiService(retrofit: Retrofit): ApiService {
		return retrofit.create(ApiService::class.java)
	}
	
	@Provides
	@Singleton
	fun provideLoginRepository(apiService: ApiService): LoginRepository {
		return LoginRepository(apiService)
	}
}
