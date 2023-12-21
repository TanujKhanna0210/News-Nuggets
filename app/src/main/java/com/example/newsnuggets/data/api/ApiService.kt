package com.example.newsnuggets.data.api

import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "API_KEY"
    ): Response<NewsResponse>

}

// GET https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY