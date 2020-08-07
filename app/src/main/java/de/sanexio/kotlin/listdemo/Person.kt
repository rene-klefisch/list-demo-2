package de.sanexio.kotlin.listdemo

import android.graphics.drawable.Drawable

data class Person (val name : String, val alter : Int, val note: String, val farbe : Int, val pic : Drawable){
    override fun toString(): String {
        return "$name ($alter) Jahre"
    }
}
