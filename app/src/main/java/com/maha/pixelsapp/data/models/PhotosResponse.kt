package com.maha.pixelsapp.data.models

import com.google.gson.annotations.SerializedName
import com.maha.pixelsapp.data.models.Photos

data class PhotosResponse(
    var total_results:Int,
    var page:Int,
    var per_page:Int,
    @SerializedName("photos")
    var photos:List<Photos>,
    var next_page:String
)
