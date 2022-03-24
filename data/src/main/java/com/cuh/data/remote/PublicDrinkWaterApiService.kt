package com.cuh.data.remote

import retrofit2.Call
import retrofit2.http.GET

interface PublicDrinkWaterApiService {

    @GET("getRinkWaterTKAWY")
    fun getBadWaterProduct(
        serviceKey:String,
        searchYear:String,
        searchQu:String,
        searchMgc:String,
        numOfRows:Int,
        pageNo:Int
    ) : Call<Product>

}