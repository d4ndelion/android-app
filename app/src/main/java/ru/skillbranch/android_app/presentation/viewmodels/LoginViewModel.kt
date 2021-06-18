package ru.skillbranch.android_app.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.skillbranch.android_app.model.LoginModel

class LoginViewModel(
    private val mail: MutableLiveData<String>,
    private val password: MutableLiveData<String>,
    private val error: MutableLiveData<String>,
    private val isLoading: MutableLiveData<Boolean>,
    val loginModel: LoginModel? = LoginModel(mail.value, password.value)
    ) : ViewModel() {

}