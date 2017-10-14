package com.devf5.arthursalgado.coderswag.Model

/**
 * Created by arthursalgado on 13/10/17.
 */
class Category constructor(val title: String, val image: String) {
    // Tivemos que fazer o override pq o default é mostrar o local de memória do objeto, assim trocamos para mostrar por default o título do objeto
    override fun toString(): String {
        return title
    }
}