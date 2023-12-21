package com.example.newsnuggets.data.datasource

import com.example.newsnuggets.data.api.ApiService
import com.example.newsnuggets.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImplementation @Inject constructor(
    private val apiService: ApiService
): NewsDataSource {

    override fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}