package br.com.multsoftware.v1.appbookny.data.response

import br.com.multsoftware.v1.appbookny.domain.model.Book
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    @Json(name = "title")
    val title: String,
    @Json(name = "author")
    val author: String,
    @Json(name = "description")
    val description: String
) {
    fun getBookModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}