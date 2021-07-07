package com.dimas.made1

import android.app.Application
import com.dimas.made1.core.di.CoreModule
import com.dimas.made1.di.AppModule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@FlowPreview
@ExperimentalCoroutinesApi
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    CoreModule.databaseModule,
                    CoreModule.networkModule,
                    CoreModule.repositoryModule,
                    AppModule.useCaseModule,
                    AppModule.viewModelModule
                )
            )
        }
    }
}