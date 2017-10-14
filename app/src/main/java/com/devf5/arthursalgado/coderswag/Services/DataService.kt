package com.devf5.arthursalgado.coderswag.Services

import com.devf5.arthursalgado.coderswag.Model.Category
import com.devf5.arthursalgado.coderswag.Model.Product

/**
 * Created by arthursalgado on 13/10/17.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$14", "hat2"),
            Product("Devslopes Hat White", "$16", "hat3"),
            Product("Devslopes Hat Snapback", "$20", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$14", "hat2"),
            Product("Devslopes Hat White", "$16", "hat3"),
            Product("Devslopes Hat Snapback", "$20", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$14", "hat2"),
            Product("Devslopes Hat White", "$16", "hat3"),
            Product("Devslopes Hat Snapback", "$20", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$33", "hoodie3"),
            Product("Devslopes Black Hoodie", "$35", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$33", "hoodie3"),
            Product("Devslopes Black Hoodie", "$35", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$33", "hoodie3"),
            Product("Devslopes Black Hoodie", "$35", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios Hustle", "$18", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios Hustle", "$18", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios Hustle", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}