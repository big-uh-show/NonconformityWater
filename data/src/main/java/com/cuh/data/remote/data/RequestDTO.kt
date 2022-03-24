package com.cuh.data.remote.data

import com.google.gson.annotations.SerializedName

data class RequestDTO (
    @SerializedName("serviceKey")
    val serviceKey:String,
    @SerializedName("search_year")
    val search_year:String,
    @SerializedName("search_qu")
    val search_qu:String,
    @SerializedName("search_mgc")
    val search_mgc:String,
    @SerializedName("numOfRows")
    val numOfRows:String,
    @SerializedName("pageNo")
    val pageNo:String
    )