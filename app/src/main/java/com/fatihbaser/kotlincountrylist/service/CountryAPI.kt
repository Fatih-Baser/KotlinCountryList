package com.fatihbaser.kotlincountrylist.service

import com.fatihbaser.kotlincountrylist.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {
    //GET ,POST
//https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json

    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getCoruntries():Single<List<Country>>
}