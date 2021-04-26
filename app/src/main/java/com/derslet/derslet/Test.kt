package com.derslet.derslet

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import java.util.*


class Test : AppCompatActivity() {

    var menu: TextInputLayout? = null
    var acliste: AutoCompleteTextView? = null

    var arrayList_season: ArrayList<String>? = null
    var arrayAdapter_season: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        menu = findViewById<View>(R.id.ders_secim) as TextInputLayout
        acliste = findViewById<View>(R.id.ic_liste) as AutoCompleteTextView

        arrayList_season = ArrayList()
        arrayList_season!!.add("Amına")
        arrayList_season!!.add("Koyim")
        arrayList_season!!.add("Android")

        arrayAdapter_season = ArrayAdapter(
                applicationContext, R.layout.acilir_menu,
                arrayList_season!!
        )
        acliste!!.setAdapter(arrayAdapter_season)
        acliste!!.threshold = 1


        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
            val intent = Intent(this, com.derslet.derslet.Acilis::class.java)
            startActivity(intent)
        }
    }
}