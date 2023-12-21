package com.example.newsnuggets.ui.repository

import com.example.newsnuggets.data.datasource.NewsDataSource
import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
) {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return newsDataSource.getNewsHeadline(country)
    }

}