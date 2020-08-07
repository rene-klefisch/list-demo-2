package de.sanexio.kotlin.listdemo

import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_scrolling.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        val meinIntent = intent
        val name = meinIntent.getStringExtra("userName")
        val alter = meinIntent.getStringExtra("userAlter")
        val note = meinIntent.getStringExtra("userNote")
        val farbe = meinIntent.getStringExtra("userFarbe")

        Log.i("Test", name + alter + note + farbe)

        toolbar_layout.title = name + " " + alter
        toolbar_layout.setBackgroundColor(farbe.toInt())
        contentText.text = note

    }
}