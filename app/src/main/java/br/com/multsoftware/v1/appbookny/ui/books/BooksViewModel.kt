package br.com.multsoftware.v1.appbookny.ui.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.multsoftware.v1.appbookny.domain.model.Book

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        //booksLiveData.value = createFakeBooks()
    }

    // Moke
    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Title 01", "Author 01"),
            Book("Title 02", "Author 02"),
            Book("Title 03", "Author 03"),
            Book("Title 04", "Author 04"),
            Book("Title 05", "Author 05"),
            Book("Title 06", "Author 06"),
            Book("Title 07", "Author 07"),
            Book("Title 08", "Author 08")
        )
    }
}