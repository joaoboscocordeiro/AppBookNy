package br.com.multsoftware.v1.appbookny.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
    }

    companion object {
        fun getStartIntent(context: Context, title: String, description: String): Intent {
            return Intent(context, BookDetailsActivity::class.java).apply {

            }
        }
    }
}