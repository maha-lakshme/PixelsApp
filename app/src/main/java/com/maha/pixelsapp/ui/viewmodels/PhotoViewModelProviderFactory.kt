package com.maha.pixelsapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maha.pixelsapp.repository.PhotosRepository
import com.maha.pixelsapp.repository.PhotosRepositoryImp

class PhotoViewModelProviderFactory(private val photosRepositoryImpl: PhotosRepositoryImp):
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PhotosViewModel(photosRepositoryImpl) as T
    }
}