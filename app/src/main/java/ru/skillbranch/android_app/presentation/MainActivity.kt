package ru.skillbranch.android_app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import ru.skillbranch.android_app.R
import ru.skillbranch.android_app.appModule
import ru.skillbranch.android_app.data.AuthorizationService
import ru.skillbranch.android_app.model.LoginModel
import ru.skillbranch.android_app.presentation.viewmodels.LoginViewModel

class MainActivity : AppCompatActivity() {
    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadKoinModules(appModule)
    }
}