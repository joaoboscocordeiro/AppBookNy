package br.com.multsoftware.v1.appbookny.data.repository

import br.com.multsoftware.v1.appbookny.data.ApiService
import br.com.multsoftware.v1.appbookny.data.BooksResult
import br.com.multsoftware.v1.appbookny.data.response.BookBodyResponse
import br.com.multsoftware.v1.appbookny.domain.model.Book
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by João Bosco on 30/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class BooksApiDataSource : BooksRepository{

    override fun getBooks(booksResultCallback: (result: BooksResult) -> Unit) {
        ApiService.service.getBooks().enqueue(object : Callback<BookBodyResponse> {
            override fun onResponse(call: Call<BookBodyResponse>, response: Response<BookBodyResponse>) {
                when {
                    response.isSuccessful -> {
                        val books: MutableList<Book> = mutableListOf()

                        response.body()?.let { bookBodyResponse ->
                            for (result in bookBodyResponse.bookResults) {
                                val book = result.bookDetailResponse[0].getBookModel()
                                books.add(book)
                            }
                        }

                        booksResultCallback(BooksResult.Success(books))
                    }
                    else -> booksResultCallback(BooksResult.ApiError(response.code()))
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {
                booksResultCallback(BooksResult.ServerError)
            }
        })
    }
}