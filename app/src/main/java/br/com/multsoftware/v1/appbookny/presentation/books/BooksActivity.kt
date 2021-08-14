package br.com.multsoftware.v1.appbookny.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.multsoftware.v1.appbookny.R
import br.com.multsoftware.v1.appbookny.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbar.title = getString(R.string.books_title)
        setSupportActionBar(toolbar)

        with(recycler_books) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }
    }

    // Moke
    fun getBooks(): List<Book> {
        return listOf(
            Book("Title 01", "Author 01"),
            Book("Title 02", "Author 02"),
            Book("Title 03", "Author 03"),
            Book("Title 04", "Author 04")
        )
    }
}
