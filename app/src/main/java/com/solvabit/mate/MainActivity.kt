package com.solvabit.mate

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.welcome_screen.*
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import android.net.ConnectivityManager as ConnectivityManager







class MainActivity : BaseActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)



        button.setOnClickListener{
            var intent= Intent( this,LogIn::class.java)
            startActivity(intent)
        }


    }

}
