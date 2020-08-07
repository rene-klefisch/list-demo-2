package de.sanexio.kotlin.listdemo

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Person>()
        items.add(Person("Susanne",32,"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam",Color.parseColor("#cd661d"), getDrawable(R.drawable.pers1)))//3
        items.add(Person("Julia",35,"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam",Color.parseColor("#cd661d"), getDrawable(R.drawable.pers2)))
        items.add(Person("Sabine",15,"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam",Color.parseColor("#cd661d"), getDrawable(R.drawable.pers3)))

        kontaktliste.adapter = EigenerAdapter(this,items)

        kontaktliste.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Geklickt wurde: ${items.get(position)} ",Toast.LENGTH_LONG).show()
            val detailIntent = Intent(this, DetailActivity::class.java)
            detailIntent.putExtra("userName", items.get(position).name)
            detailIntent.putExtra("userAlter", items.get(position).alter.toString())
            detailIntent.putExtra("userNote", items.get(position).note)
            detailIntent.putExtra("userFarbe", items.get(position).farbe.toString())
            startActivity(detailIntent)
        }
    }
}
