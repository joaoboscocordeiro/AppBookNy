package br.com.multsoftware.v1.appbookny.data

import br.com.multsoftware.v1.appbookny.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "NWsghxNJ1cGPbRZPfOkMgzAZ3D0NIEt3",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}