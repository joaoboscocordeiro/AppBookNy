package br.com.multsoftware.v1.appbookny.ui.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * Created by João Bosco on 28/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
open class BaseActivity : AppCompatActivity() {

    protected fun setupToolbar(toolbar: Toolbar, titleIdRes: Int) {
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
    }
}