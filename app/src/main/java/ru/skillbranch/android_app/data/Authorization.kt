package ru.skillbranch.android_app.data

interface Authorization {
    suspend fun checkUserAuth(mail: String, password: String) : Boolean
    suspend fun signIn(mail: String, password: String) : Boolean
}