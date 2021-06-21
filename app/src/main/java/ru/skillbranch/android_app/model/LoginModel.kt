package ru.skillbranch.android_app.model

import ru.skillbranch.android_app.data.AuthorizationService

class LoginModel(
    private val mail: String? = "",
    private val password: String? = "",
    private val authorizationService: AuthorizationService = AuthorizationService.create()
) {
    suspend fun signIn(): Boolean {
        return authorizationService.signIn(mail, password)
    }
}