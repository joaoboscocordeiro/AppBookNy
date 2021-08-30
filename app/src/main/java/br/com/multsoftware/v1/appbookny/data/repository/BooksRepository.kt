package br.com.multsoftware.v1.appbookny.data.repository

import br.com.multsoftware.v1.appbookny.data.BooksResult

/**
 * Created by João Bosco on 30/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
interface BooksRepository {

    fun getBooks(booksResultCallback: (result: BooksResult) -> Unit)
}