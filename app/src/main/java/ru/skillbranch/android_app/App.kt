package ru.skillbranch.android_app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module
import ru.skillbranch.android_app.data.AuthorizationService
import ru.skillbranch.android_app.model.LoginModel
import ru.skillbranch.android_app.presentation.MainActivity
import ru.skillbranch.android_app.presentation.viewmodels.LoginViewModel

val appModule = module {
    factory { LoginModel(mail = get(), password = get()) }
    single { AuthorizationService.create() }
    viewModel { LoginViewModel(mail = get(), password = get()) }
}

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(appModule) // java.lang.NoSuchMethodError: No virtual method elapsedNow-UwyO8pc()D in class Lkotlin/time/TimeMark;
        }
    }

}