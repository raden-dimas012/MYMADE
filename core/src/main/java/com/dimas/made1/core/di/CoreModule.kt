package com.dimas.made1.core.di


import androidx.room.Room
import com.dimas.made1.core.BuildConfig
import com.dimas.made1.core.data.repository.DataRepository
import com.dimas.made1.core.data.source.local.LocalDataSource
import com.dimas.made1.core.data.source.local.room.AppDatabase
import com.dimas.made1.core.data.source.remote.RemoteDataSource
import com.dimas.made1.core.data.source.remote.network.ApiService
import com.dimas.made1.core.domain.repository.IDataRepository
import com.dimas.made1.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object CoreModule {

    val databaseModule = module {
        factory { get<AppDatabase>().appDao() }
        single {
            val passphrase: ByteArray = SQLiteDatabase.getBytes("made1".toCharArray())
            val factory = SupportFactory(passphrase)
            Room.databaseBuilder(
                androidContext(),
                AppDatabase::class.java, "App.db"
            )
                .fallbackToDestructiveMigration()
                .openHelperFactory(factory)
                .build()
        }
    }

    val networkModule = module {
        single {
            val hostname = "api.themoviedb.org"
            val certificatePinner = CertificatePinner.Builder()
                .add(hostname, "sha256/+vqZVAzTqUP8BGkfl88yU7SQ3C8J2uNEa55B7RZjEg0=")
                .add(hostname, "sha256/JSMzqOOrtyOT1kmau6zKhgT676hGgczD5VMdRMyJZFA=")
                .add(hostname, "sha256/++MBgDH5WGvL9Bcn5Be30cRcL0f5O+NyoXuWtQdX1aI=")
                .add(hostname, "sha256/KwccWaCgrnaw6tsrrSO61FgLacNgG2MMLq8GE6+oP5I=")
                .build()
            OkHttpClient.Builder().apply {
                if (BuildConfig.DEBUG) {
                    addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                }
            }
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .certificatePinner(certificatePinner)
                .build()
        }
        single {
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(get())
                .build()
            retrofit.create(ApiService::class.java)
        }
    }

    val repositoryModule = module {
        single { LocalDataSource(get()) }
        single { RemoteDataSource(get()) }
        factory { AppExecutors() }
        single<IDataRepository> {
            DataRepository(
                get(),
                get(),
                get()
            )
        }
    }
}