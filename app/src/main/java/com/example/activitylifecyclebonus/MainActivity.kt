package com.example.activitylifecyclebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textView)

    }

    override fun onPause() {
        super.onPause()
        //called when activity is not visible to the user.
        textView.setText( textView.text.toString()+"\n"+SimpleDateFormat("hh:mm:ss a dd/M/yyyy").format(Date()).toString())
    }

    override fun onResume() {
        super.onResume()
        //called when activity will start interacting with the user.
        textView.setText( textView.text.toString()+"\n"+"Online")

    }
}