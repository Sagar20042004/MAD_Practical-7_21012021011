package com.example.mad_practical_7_21012021011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val youTubeId = "p7T6-EmAcfw"
        val youTubeWebView:WebView = findViewById(R.id.webview)
        val webSettings:WebSettings = youTubeWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youTubeWebView.loadUrl("https://youtu.be/p7T6-EmAcfw")

    }
}
