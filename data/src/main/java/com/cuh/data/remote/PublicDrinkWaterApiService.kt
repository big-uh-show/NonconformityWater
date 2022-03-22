package com.cuh.data.remote

import retrofit2.Call
import retrofit2.http.GET

interface PublicDrinkWaterApiService {

    private val BASE_URL: String
        get() = "http://apis.data.go.kr/1480523/Dwqualityservice/"

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