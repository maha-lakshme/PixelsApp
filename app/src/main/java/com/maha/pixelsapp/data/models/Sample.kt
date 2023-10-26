package com.maha.pixelsapp.data.models

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.maha.pixelsapp.data.api.PhotosApi
import com.maha.pixelsapp.data.api.RetrofitInstance
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Sample {

      var loggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
      private lateinit var log: String
  private val smapl by lazy {
      var loggingInterceptor = HttpLoggingInterceptor()
      loggingInterceptor

  }
// On MainActivity without viewmodel for testing data
//    var retrofitInstance = RetrofitInstance.retrofit.create(PhotosApi::class.java)
//    retrofitInstance.getPopularPhotos(1).enqueue(object: Callback<PhotosResponse>
//    {
//        override fun onResponse(
//            call: Call<PhotosResponse>,
//            response: Response<PhotosResponse>
//        ) {
//            //if(response.isSuccessful){
//            // var photosResponse:List<PhotosResponse>? = response.body()
//            // if(photosResponse!=null) {
//            //   for(photos in photosResponse)
//            Log.d("TAG", "Response--->"+response.body().toString())
//            //  }
//            //  }
//        }
//
//        override fun onFailure(call: Call<PhotosResponse>, t: Throwable) {
//            Log.d("TAG", "Error--->"+t.message.toString())
//
//        }
//
//    })
//
//    var response : LiveData<Response<PhotosResponse>> = liveData {
//        // var result: Response<PhotosResponse> = retrofitInstance.getPhotos("nature")
//        emit(retrofitInstance.getPhotos("nature"))
//    }
//    response.observe(this, Observer {
//        Log.d("TAG", "Live data Response--->"+it.body().toString())
//
//    })

}