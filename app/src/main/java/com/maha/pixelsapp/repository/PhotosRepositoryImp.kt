package com.maha.pixelsapp.repository

import com.maha.pixelsapp.data.api.PhotosApi
import com.maha.pixelsapp.data.api.RetrofitInstance
import com.maha.pixelsapp.data.models.PhotosResponse
import retrofit2.Response

class PhotosRepositoryImp() :PhotosRepository {

    private var photosApiInstance:PhotosApi= RetrofitInstance.getRetrofit()

    override suspend fun getCuratedPhotos(pageNo :Int): Response<PhotosResponse> {
        return photosApiInstance.getPopularPhotos(pageNo)
    }

    override suspend fun getSearchPhotos(searchItem:String): Response<PhotosResponse> {
       return photosApiInstance.getPhotos(searchItem)
    }
}