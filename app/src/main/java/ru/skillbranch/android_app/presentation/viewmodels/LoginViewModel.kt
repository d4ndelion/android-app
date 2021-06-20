package ru.skillbranch.android_app.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.skillbranch.android_app.data.AuthorizationService
import ru.skillbranch.android_app.model.LoginModel

class LoginViewModel(
    var mail: MutableLiveData<String>? = null,
    var password: MutableLiveData<String>? = null,
    private val error: MutableLiveData<String>? = null,
    private val isLoading: MutableLiveData<Boolean>? = null,
    val loginModel: LoginModel? = LoginModel(mail?.value, password?.value)
    ) : ViewModel() {
}