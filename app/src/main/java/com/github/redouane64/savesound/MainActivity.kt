package com.github.redouane64.savesound

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    val splashScreen: Long = 2000; // milliseconds.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Pause thread for 2 seconds to display splash screen. */
        Thread.sleep(splashScreen)

        theme.applyStyle(R.style.AppTheme, true)
        setContentView(R.layout.activity_main)
    }
}
