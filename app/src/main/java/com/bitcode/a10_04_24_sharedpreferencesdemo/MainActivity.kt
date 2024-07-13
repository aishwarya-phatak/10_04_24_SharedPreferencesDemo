package com.bitcode.a10_04_24_sharedpreferencesdemo

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //way 1
        val prefs : SharedPreferences =
            getSharedPreferences("my_prefs",
                Activity.MODE_PRIVATE)

        val editor = prefs.edit()
        editor.putString("name","Aishwarya")
        editor.putInt("code",1234)
        editor.commit()

        val name = prefs.getString("name","NA")
        val code = prefs.getInt("code",-1)
        Log.e("tag", "Name - $name -- Code - $code")

        UserData.storeToken(this,"ABC#@423")
        Log.e("tag",UserData.getToken(this)!!)
    }
}