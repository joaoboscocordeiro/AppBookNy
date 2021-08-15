package br.com.multsoftware.v1.appbookny.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
object ApiService {

    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val service = initRetrofit().create(NYTServices::class.java)
}