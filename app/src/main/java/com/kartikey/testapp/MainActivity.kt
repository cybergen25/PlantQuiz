package com.kartikey.plantquiz

import android.os.AsyncTask
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.kartikey.testapp.R
import com.kartikey.testapp.R.id.text

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Toast.makeText(this, "THE ONCREATE METHOD IS CALLED", Toast.LENGTH_SHORT).show()


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    fun button1IsClicked(buttonView: View){
        Toast.makeText(this, "Button 1 is Clicked", Toast.LENGTH_SHORT).show()
    }

    fun button2IsClicked(buttonView: View){
        Toast.makeText(this, "Button 2 is Clicked", Toast.LENGTH_SHORT).show()
    }

    fun button3IsClicked(buttonView: View){
        Toast.makeText(this, "Button 3 is Clicked", Toast.LENGTH_SHORT).show()
    }

    fun button4IsClicked(buttonView: View){
        Toast.makeText(this, "Button 4 is Clicked", Toast.LENGTH_SHORT).show()
    }

    inner class DownloadingPlantTask: AsyncTask<String, Int, List<Plant>>(){
        override fun doInBackground(vararg params: String?): List<Plant> {

            // can access background thread. Not UI thread
        }

        override fun onPostExecute(result: List<Plant>?) {
            super.onPostExecute(result)

            // can access UI thread. Not background Thread
        }
    }





}
