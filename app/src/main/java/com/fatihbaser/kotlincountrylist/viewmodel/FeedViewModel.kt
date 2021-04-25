package com.fatihbaser.kotlincountrylist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fatihbaser.kotlincountrylist.model.Country
import com.fatihbaser.kotlincountrylist.service.CountryApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class FeedViewModel :ViewModel() {
    val countries= MutableLiveData<List<Country>>()
    val countryError= MutableLiveData<Boolean>()
    val countryLoading=MutableLiveData<Boolean>()

    private val countryApiService =CountryApiService()
    private val disposable=CompositeDisposable()

    fun refreshData(){
//        val country=Country("Turkey","Asia","Ankara","TRY","Turkish","www.aa.com ")
//
//        val country1=Country("France","Europe","Paris","Euro","Franch","www.aa.com ")
//
//        val country2=Country("Turkey","Europe","Berlin","Euro","German","www.aa.com ")
//
//
//        val countryList= arrayListOf<Country>(country,country1,country2)
//        countries.value=countryList
//        countryError.value=false
//        countryLoading.value=false

        //countryApiService
        getDataFromAPI()
    }
    private fun getDataFromAPI(){

        countryLoading.value=true
        disposable.add(countryApiService.getData().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(object : DisposableSingleObserver<List<Country>>(){
                    override fun onSuccess(t: List<Country>) {
                       countries.value=t
                        countryError.value=false
                        countryLoading.value=false
                    }

                    override fun onError(e: Throwable) {
                        countryError.value=true
                        countryLoading.value=false
                        e.printStackTrace()
                    }

                }
        ))
    }
}