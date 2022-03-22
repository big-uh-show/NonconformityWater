package com.cuh.data.remote

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml
import retrofit2.http.Body
import retrofit2.http.Header

@Xml(name = "response")
data class Product(
    @Element
    val header:Header,
    @Element
    val body: Body
)

@Xml(name = "header")
data class Header(
    @PropertyElement
    val resultCode : Int,
    @PropertyElement
    val resultMsg : String
)

@Xml(name = "body")
data class Body(
    @Element
    val items:String,
    @PropertyElement
    val numOfRows:Int,
    @PropertyElement
    val pageNo:Int,
    @PropertyElement
    val totalCount:Int
)