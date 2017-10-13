package com.devf5.arthursalgado.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.devf5.arthursalgado.coderswag.Adapters.CategoryAdapter
import com.devf5.arthursalgado.coderswag.Adapters.CategoryRecycleAdapter
import com.devf5.arthursalgado.coderswag.R
import com.devf5.arthursalgado.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter // Criamos com o recycle
            //CategoryAdapter // Criamos um adapter específico para o layout do projeto
            //ArrayAdapter<Category> // Adapter é o que controla as informações do model pra ser mostrado na ListView (view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ArrayAdapter(context, que tipo de view que será mostrado na ListView, qual dado que será mostrado)
        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        // Não é a melhor maneira de implementar
        //ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        // Saber em qual clicou. Mas vamos utilizar outro método com recycle views
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on ${category.title} !", Toast.LENGTH_SHORT).show()
//        }


    }
}
