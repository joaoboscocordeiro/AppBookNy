package br.com.multsoftware.v1.appbookny.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
@JsonClass(generateAdapter = true)
data class BookResultsResponse(
    @Json(name = "book_details")
    val bookDetailResponse: List<BookDetailsResponse>
)