package ua.ck.taras.koinapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import ua.ck.taras.koinapp.data.RepositoryImpl
import ua.ck.taras.koinapp.data.service.FileSystemDataSource
import ua.ck.taras.koinapp.domain.Repository
import ua.ck.taras.koinapp.presentation.ui.main.MainViewModel

class MainApp : Application() {

    private val repositoryModule = module {
        single<Repository> { RepositoryImpl(get()) }
        single { FileSystemDataSource() }
    }

    private val viewModelModule = module {
        viewModel { MainViewModel(get()) }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@MainApp)
            modules(
                listOf(
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }
}