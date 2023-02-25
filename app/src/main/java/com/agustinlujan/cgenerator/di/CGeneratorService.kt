package com.agustinlujan.cgenerator.di
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CGeneratorService {
    private val URL="http://vps-3148756-x.dattaweb.com/apis/apiCGenerator/api.php?"
    @Singleton
    @Provides
    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
            .build()

    }

}