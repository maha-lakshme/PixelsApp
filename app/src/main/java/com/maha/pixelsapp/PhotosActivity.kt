package com.maha.pixelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.elevation.SurfaceColors
import com.maha.pixelsapp.databinding.ActivityPhotosBinding
import com.maha.pixelsapp.repository.PhotosRepositoryImp
import com.maha.pixelsapp.ui.viewmodels.PhotoViewModelProviderFactory
import com.maha.pixelsapp.ui.viewmodels.PhotosRecyclerViewAdapter
import com.maha.pixelsapp.ui.viewmodels.PhotosViewModel

class PhotosActivity : AppCompatActivity() {
    private lateinit var factory:PhotoViewModelProviderFactory
    private lateinit var viewModel: PhotosViewModel
    private lateinit var binding:ActivityPhotosBinding
    private lateinit var adapter: PhotosRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val color = SurfaceColors.SURFACE_2.getColor(this)
        window.statusBarColor = color // Set color of system statusBar same as ActionBar
        window.navigationBarColor = color
        setContentView(R.layout.activity_photos)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_photos)
        factory = PhotoViewModelProviderFactory(PhotosRepositoryImp())
        viewModel = ViewModelProvider(this,factory).get(PhotosViewModel::class.java)



//        viewModel.getSearchResult().observe(this,Observer{
//            Log.d("Serach REsponse --->",it.toString())
//
//        })
        initRecyclerView()

    }

    private fun initRecyclerView() {
        binding.photoRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter  = PhotosRecyclerViewAdapter()
        binding.photoRecyclerView.adapter = adapter

        viewModel.getPhotoCureatedResponse().observe(this,Observer{ photoList->
            Log.d("Curated REsponse --->",photoList.toString())
            if(photoList!=null){
                adapter.setList(photoList.photos)
                adapter.notifyDataSetChanged()

            }else{
                Log.d("TAG","error");
            }
        })
    }
}