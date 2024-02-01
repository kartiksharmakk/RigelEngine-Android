package com.rigel.rigelandroid

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

        val dukeGameView = findViewById<WebView>(R.id.RigelEngine)
        dukeGameView.webViewClient = WebViewClient()
        dukeGameView.settings.javaScriptEnabled = true
        dukeGameView.loadUrl("https://rigelengine.nikolai-wuttke.de")

        val arrowUpButton = findViewById<ImageButton>(R.id.arrow_up)
        arrowUpButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_UP))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_UP))
                }
            }
            true
        }

        val arrowDownButton = findViewById<ImageButton>(R.id.arrow_down)
        arrowDownButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_DOWN))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_DOWN))
                }
            }
            true
        }

        val arrowLeftButton = findViewById<ImageButton>(R.id.arrow_left)
        arrowLeftButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_LEFT))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_LEFT))
                }
            }
            true
        }

        val arrowRightButton = findViewById<ImageButton>(R.id.arrow_right)
        arrowRightButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_RIGHT))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_DPAD_RIGHT))
                }
            }
            true
        }

        val fireButton = findViewById<ImageButton>(R.id.fire_button)
        fireButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ALT_LEFT))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_ALT_LEFT))
                }
            }
            true
        }

        val jumpButton = findViewById<ImageButton>(R.id.jump_button)
        jumpButton.setOnTouchListener { view, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Perform the action when the button is pressed
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_CTRL_LEFT))
                }
                MotionEvent.ACTION_UP -> {
                    // Perform the action when the button is released
                    dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_CTRL_LEFT))
                }
            }
            true
        }

        val f1Button = findViewById<ImageButton>(R.id.f1_button)
        f1Button.setOnClickListener {
            keyPressClickButtonEvent(KeyEvent.KEYCODE_F1)
        }

        val hButton = findViewById<ImageButton>(R.id.h_button)
        hButton.setOnClickListener {
            keyPressClickButtonEvent(KeyEvent.KEYCODE_H)
        }

        val escButton = findViewById<ImageButton>(R.id.esc_button)
        escButton.setOnClickListener {
            keyPressClickButtonEvent(KeyEvent.KEYCODE_ESCAPE)
        }

        val enterButton = findViewById<ImageButton>(R.id.enter_button)
        enterButton.setOnClickListener {
            keyPressClickButtonEvent(KeyEvent.KEYCODE_ENTER)
        }
    }

    fun keyPressClickButtonEvent(keyButton: Int){
        val eventDown = KeyEvent(KeyEvent.ACTION_DOWN, keyButton)
        val eventUp = KeyEvent(KeyEvent.ACTION_UP, keyButton)
        dispatchKeyEvent(eventDown)
        dispatchKeyEvent(eventUp)
    }
}
