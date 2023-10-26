package com.maha.pixelsapp.ui.viewmodels

import androidx.lifecycle.*
import com.maha.pixelsapp.data.models.PhotosResponse
import com.maha.pixelsapp.repository.PhotosRepository
import com.maha.pixelsapp.repository.PhotosRepositoryImp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class PhotosViewModel(private var photoRepoImpl:PhotosRepositoryImp):ViewModel() {
   // private var photoResponse = MutableLiveData<PhotosResponse>()
     fun getPhotoCureatedResponse() = liveData {
        val result: PhotosResponse? = photoRepoImpl.getCuratedPhotos(5).body()
        val list = ArrayList<PhotosResponse?>()
        list.add(result)
        emit(result)
    }

    fun getSearchResult()= liveData{
        val result =photoRepoImpl.getSearchPhotos("Nature").body()
        emit(result)

    }

//    fun getSearchResultsCo() = CoroutineScope(Dispatchers.IO).launch{
//        val result =photoRepoImpl.getSearchPhotos("Nature").body()
//    }
//
//
//    fun getSearchRes() = viewModelScope.launch {
//        val result =photoRepoImpl.getSearchPhotos("Nature").body()
//    }
}

