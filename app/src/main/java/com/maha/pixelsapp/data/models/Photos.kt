package com.maha.pixelsapp.data.models

import com.google.gson.annotations.SerializedName

data class Photos(
    var id:Int,
    var width:Int,
    var height:Int,
    var url:String,
    var photographer:String,
    var photographer_url:String,
    var photographer_id:String,
    var avg_color:String,
    @SerializedName("src")
    var src:Source,
    var liked:Boolean,
    var alt:String
)
