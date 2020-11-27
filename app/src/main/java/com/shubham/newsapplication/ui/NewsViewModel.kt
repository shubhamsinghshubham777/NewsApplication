package com.shubham.newsapplication.ui

import androidx.lifecycle.ViewModel
import com.shubham.newsapplication.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {

}