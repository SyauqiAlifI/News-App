package com.aplikasi.newsapp

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class News (
    val title: String,
    val content: String,
    val date: String,
    val author: String,
    val time: String,
    val category: String,
    val photo: Int
) : Parcelable
