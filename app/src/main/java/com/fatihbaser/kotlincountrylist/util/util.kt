package com.fatihbaser.kotlincountrylist.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fatihbaser.kotlincountrylist.R

//Extension

/*fun String.myExtension(myParameter:String){
    println(myParameter)
}*/

fun ImageView.downloadFromUrl(url:String?,progressDrawable: CircularProgressDrawable){
    val options=RequestOptions().placeholder(progressDrawable).error(R.drawable.ic_launcher_background)
    Glide.with(context  )
            .setDefaultRequestOptions(options)
            .load(url)
            .into(this)
}

fun placeholderProgressBar(contex:Context) :CircularProgressDrawable{
    return CircularProgressDrawable(contex).apply {
        strokeWidth=8f
        centerRadius=40f
        start()
    }
}

