package com.fatihbaser.kotlincountrylist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fatihbaser.kotlincountrylist.model.Country

class CountryViewModel: ViewModel() {

    val countryLiveData=MutableLiveData<Country>()

    fun getDataFromRoom(){
        val country=Country("Turkey","Asia","Ankara","TRY","Turkish","www.aa.com ")

        countryLiveData.value=country
    }
}