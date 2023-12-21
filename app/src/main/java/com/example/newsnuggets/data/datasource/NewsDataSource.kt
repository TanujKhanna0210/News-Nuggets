package com.example.newsnuggets.data.datasource

import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    fun getNewsHeadline(country: String): Response<NewsResponse>

}