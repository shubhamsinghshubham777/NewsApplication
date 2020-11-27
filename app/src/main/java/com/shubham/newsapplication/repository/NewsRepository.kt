package com.shubham.newsapplication.repository

import com.shubham.newsapplication.RetrofitInstance
import com.shubham.newsapplication.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}