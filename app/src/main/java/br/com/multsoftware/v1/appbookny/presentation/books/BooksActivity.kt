package br.com.multsoftware.v1.appbookny.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.multsoftware.v1.appbookny.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbar.title = getString(R.string.books_title)
        setSupportActionBar(toolbar)
    }
}
