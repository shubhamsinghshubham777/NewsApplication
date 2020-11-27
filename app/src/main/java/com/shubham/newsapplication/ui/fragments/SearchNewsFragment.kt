package com.shubham.newsapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shubham.newsapplication.R
import com.shubham.newsapplication.ui.NewsActivity
import com.shubham.newsapplication.ui.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =  (activity as NewsActivity).viewModel

    }
}