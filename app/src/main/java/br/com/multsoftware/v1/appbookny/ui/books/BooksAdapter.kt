package br.com.multsoftware.v1.appbookny.ui.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.multsoftware.v1.appbookny.R
import br.com.multsoftware.v1.appbookny.domain.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

/**
 * Created by João Bosco on 14/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class BooksAdapter(
    private val books: List<Book>
): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) =
        holder.bindView(books[position])

    override fun getItemCount(): Int = books.size

    class BooksViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val title = itemView.text_title
        private val author = itemView.text_author

        fun bindView(book: Book) {
            title.text = book.title
            author.text = book.author
        }
    }
}