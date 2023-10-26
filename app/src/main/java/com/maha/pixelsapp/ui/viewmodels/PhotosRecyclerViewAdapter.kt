package com.maha.pixelsapp.ui.viewmodels

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maha.pixelsapp.R
import com.maha.pixelsapp.data.models.Photos
import com.maha.pixelsapp.data.models.PhotosResponse
import com.maha.pixelsapp.databinding.ListItemsBinding
import com.squareup.picasso.Picasso

class PhotosRecyclerViewAdapter : RecyclerView.Adapter<PhotosViewHolder>() {
    var photolist = ArrayList<Photos>()
    fun setList(list:List<Photos>){
        photolist.clear()
        photolist.addAll(list)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var binding:ListItemsBinding =DataBindingUtil.inflate(layoutInflater, R.layout.list_items,parent,false)
        return PhotosViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return photolist.size
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        holder.bind(photolist[position])
    }
}


class PhotosViewHolder(private val binding: ListItemsBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(photos:Photos){
       binding.photographerName.text = photos.photographer

        Glide.with(binding.productImage.context).apply {
            load(photos.src.tiny).into(binding.productImage)
        }
Log.d("TAG---",photos.src.tiny)


    }
}