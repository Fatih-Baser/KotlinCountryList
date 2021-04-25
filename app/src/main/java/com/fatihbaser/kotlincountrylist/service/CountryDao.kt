package com.fatihbaser.kotlincountrylist.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.fatihbaser.kotlincountrylist.model.Country

@Dao
interface CountryDao {

    //Data Access Object
    @Insert
    suspend fun  insertAll(vararg countries:Country) : List<Long>

    //Insert -> insert into
    // suspend -> coroutine , pauese ^ resume
    //vararg -> multiple country objects
    //List<Long> -> pprimary keys
    @Query("SELECT * FROM country")
    suspend fun getAllCountries() : List<Country>

    @Query("SELECT * FROM country WHERE uuid = :countryId")
    suspend fun getCountry(countryId : Int) : Country

    @Query("DELETE FROM country")
    suspend fun deleteAllCountries()
}