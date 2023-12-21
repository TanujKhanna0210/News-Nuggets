package com.example.newsnuggets.data.api

import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "176a9c5e6ec34a518b3b7a4b4bef055e"
    ): Response<NewsResponse>

}

// GET https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY