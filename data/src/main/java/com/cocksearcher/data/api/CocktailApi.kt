package com.cocksearcher.data.api

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CocktailApi {

    @GET("/cocktail")
    fun getCocktail()

    @GET("/cocktail/{id}")
    fun getCocktailDetail(
        @Path("id") id: String
    )

    @POST("cocktail/{id}/prefer")
    fun patchLickCocktail(
        @Path("id") id : String
    )

    @GET("cocktail/today")
    fun geyTodayCocktail()
}