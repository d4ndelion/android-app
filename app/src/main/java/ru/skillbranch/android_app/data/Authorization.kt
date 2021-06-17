package ru.skillbranch.android_app.data

interface Authorization {
    suspend fun checkAuth(token: String, password: String)

    suspend fun getUserToken(mail: String, password: String)
}