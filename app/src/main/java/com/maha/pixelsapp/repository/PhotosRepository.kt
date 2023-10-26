package com.maha.pixelsapp.repository

import com.maha.pixelsapp.data.models.PhotosResponse
import retrofit2.Response

interface PhotosRepository {
suspend fun getCuratedPhotos(pageNo:Int):Response<PhotosResponse>
suspend fun getSearchPhotos(searchItem:String):Response<PhotosResponse>
}