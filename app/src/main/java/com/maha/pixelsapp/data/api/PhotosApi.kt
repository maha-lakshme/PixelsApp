package com.maha.pixelsapp.data.api


import com.maha.pixelsapp.BuildConfig
import com.maha.pixelsapp.data.models.PhotosResponse

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PhotosApi {
 @Headers("Authorization:${BuildConfig.API_KEY}")
 @GET("search")
 suspend fun getPhotos(@Query("query")popular:String):Response<PhotosResponse>

 @Headers("Authorization:${BuildConfig.API_KEY}")
 @GET("curated")
 suspend fun getPopularPhotos(@Query("curated")per_page:Int):Response<PhotosResponse>

// @Headers("Authorization: z54ItlsgEc2BsYo8g6VeKZssWeoTcEpk8KMoVEiA5SDMqzKOcWZIUGs6")
// @GET("curated")
// fun getPopularPhotos(@Query("curated")per_page:Int):Response<PhotosResponse>

}