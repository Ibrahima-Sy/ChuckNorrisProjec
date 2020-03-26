package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
private val TAG = "My Activity"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var names = listOf("Koh","Rheau","Naat","Vie","Russe")
        names = names.sortedBy { it.length }
        Log.d(TAG,names.toString())
        names_id.text=names.toString()
        bouton.setOnClickListener { hEsiee.text = names.get((0..names.size-1).random())}


    }

}
