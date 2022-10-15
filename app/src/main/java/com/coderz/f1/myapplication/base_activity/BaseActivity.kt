package com.coderz.f1.myapplication.base_activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.*

open class BaseActivity : AppCompatActivity() {
    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printDebugLog("Activity Created...")
        printErrorLog("onCreate")
    }

    override fun onStart() {
        super.onStart()
        printDebugLog("Activity Started...")
        printErrorLog("onStart")
    }

    override fun onStop() {
        super.onStop()
        printDebugLog("Activity Stopped...")
        printErrorLog("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printDebugLog("Activity Destroyed...")
        printErrorLog("onDestroy")
    }

    private fun printDebugLog(message: String) {
        //get the activity's name
        val activityName: String = this.localClassName
        //this would be your write to file function i just used logcat for this example
        //get the system's current time this will return the time in 'HH:mm:ss t' format
        val timeStamp = DateFormat.getTimeInstance().format(Calendar.getInstance().time)
        //get the system's current time in millis
        val timeStampMillis = Calendar.getInstance().timeInMillis

        Log.d(activityName, "[WRITE_LOG][${activityName}] - [${timeStamp}] $message")
        Log.d(activityName, "[WRITE_LOG][${activityName}] - [${timeStampMillis}] $message")
    }

    private fun printErrorLog(message: String) {
        //get the activity's name
        val activityName: String = this.localClassName
        //this would be your write to file function i just used logcat for this example
        //get the system's current time this will return the time in 'HH:mm:ss t' format
        val timeStamp = DateFormat.getTimeInstance().format(Calendar.getInstance().time)
        //get the system's current time in millis
        val timeStampMillis = Calendar.getInstance().timeInMillis

        Log.e(activityName, "[WRITE_LOG][${activityName}] - [${timeStamp}] $message")
        Log.e(activityName, "[WRITE_LOG][${activityName}] - [${timeStampMillis}] $message")
    }
}