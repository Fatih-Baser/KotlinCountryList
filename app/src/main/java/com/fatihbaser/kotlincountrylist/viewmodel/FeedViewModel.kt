package com.fatihbaser.kotlincountrylist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fatihbaser.kotlincountrylist.model.Country

class FeedViewModel :ViewModel() {
    val countries= MutableLiveData<List<Country>>()
    val countryError= MutableLiveData<Boolean>()
    val countryLoading=MutableLiveData<Boolean>()


    fun refreshData(){
        val country=Country("Turkey","Asia","Ankara","TRY","Turkish","www.aa.com ")

        val country1=Country("France","Europe","Paris","Euro","Franch","www.aa.com ")

        val country2=Country("Turkey","Europe","Berlin","Euro","German","www.aa.com ")


        val countryList= arrayListOf<Country>(country,country1,country2)
        countries.value=countryList
        countryError.value=false
        countryLoading.value=false
    }
}