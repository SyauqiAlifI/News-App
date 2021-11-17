package com.aplikasi.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplikasi.newsapp.DataNews
import com.aplikasi.newsapp.NewsAdapter
import com.aplikasi.newsapp.bindNewsHeadline
import com.aplikasi.newsapp.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    private lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)

        binding.rvPopular.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        bindNewsHeadline(binding.newsHeadline, 1)

        return binding.root
    }
}