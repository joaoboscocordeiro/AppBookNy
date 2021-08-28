package br.com.multsoftware.v1.appbookny.ui.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.multsoftware.v1.appbookny.domain.model.Book
import br.com.multsoftware.v1.appbookny.data.ApiService
import br.com.multsoftware.v1.appbookny.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        ApiService.service.getBooks().enqueue(object : Callback<BookBodyResponse> {

            override fun onResponse(call: Call<BookBodyResponse>, response: Response<BookBodyResponse>) {
                if (response.isSuccessful) {
                    val books: MutableList<Book> = mutableListOf()

                    response.body()?.let { bookBodyResponse ->
                        for (result in bookBodyResponse.bookResults) {
                            val book = Book(
                                title = result.bookDetailResponse[0].title,
                                author = result.bookDetailResponse[0].author
                            )

                            books.add(book)
                        }
                    }

                    booksLiveData.value = books
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {

            }
        })
    }
}