package com.bitcode.a10_04_24_sharedpreferencesdemo

import android.app.Activity
import android.content.Context

object UserData {
    private val USER_PREF_NAME = "user_preference"
    private val KEY_TOKEN = "token"

    fun storeToken(context : Context,token : String):Boolean{
        context.getSharedPreferences(
            USER_PREF_NAME,
            Activity.MODE_PRIVATE
        )
            .edit()
            .putString(KEY_TOKEN,token)
            .commit()
        return true
    }

    fun getToken(context: Context):String?{
        return context.getSharedPreferences(USER_PREF_NAME,
            Activity.MODE_PRIVATE)
            .getString(KEY_TOKEN,null)
    }
}