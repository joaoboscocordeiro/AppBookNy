package br.com.multsoftware.v1.appbookny.data

import br.com.multsoftware.v1.appbookny.domain.model.Book

/**
 * Created by João Bosco on 30/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
sealed class BooksResult {
    class Success(val books: List<Book>) : BooksResult()
    class ApiError(val statusCode: Int) : BooksResult()
    object ServerError : BooksResult()
}