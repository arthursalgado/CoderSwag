package com.devf5.arthursalgado.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.devf5.arthursalgado.coderswag.R
import com.devf5.arthursalgado.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val type = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
