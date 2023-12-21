package com.example.newsnuggets.data.datasource

import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse>

}