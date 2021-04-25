package com.fatihbaser.kotlincountrylist.model

import com.google.gson.annotations.SerializedName

// Veri tuttugumuz siniftir, veri ckerkern olusturulan veri sinifidir.

data class Country(
        @SerializedName("name")
        val countryName: String?,
        @SerializedName("region")
        val countryRegion: String?,
        @SerializedName("capital")
        val countryCapital : String?,
        @SerializedName("currency")
        val countryCurrency : String?,
        @SerializedName("language")
        val countryLanguage : String?,
        @SerializedName("flag")
        val imageUrl : String?)


{


}