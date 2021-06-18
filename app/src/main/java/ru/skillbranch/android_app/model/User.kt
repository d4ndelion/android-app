package ru.skillbranch.android_app.model

data class User(
    val token: String,
    val userId: String,
    val nickname: String,
    val mail: String
)