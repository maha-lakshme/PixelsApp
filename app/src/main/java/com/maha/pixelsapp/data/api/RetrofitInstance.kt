package com.maha.pixelsapp.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {

        private var loggingInterceptor: HttpLoggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        private var okHttpClient = OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()

        var retrofit: Retrofit = Retrofit.Builder().baseUrl("https://api.pexels.com/v1/")
            .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build()

        fun getRetrofit(): PhotosApi {
            return retrofit.create(PhotosApi::class.java)
        }
    }
}