package ru.skillbranch.android_app.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Query

interface AuthorizationService {
    suspend fun checkUserAuth(
        @Query("mail") mail: String?,
        @Query("password") password: String?
    ): Boolean

    suspend fun signIn(
        @Query("mail") mail: String?,
        @Query("password") password: String?
    ): Boolean

    companion object Factory {
        fun create(): AuthorizationService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://sampleurl.com")
                .build()
            return retrofit.create(AuthorizationService::class.java)
        }
    }
}