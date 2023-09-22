package com.example.mad_practical_7_21012021011

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView:VideoView = findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val bt1:FloatingActionButton = findViewById(R.id.floatingActionButton)

        bt1.setOnClickListener(){
            val intent = Intent(this, YouTubeActivity::class.java)
            startActivity(intent)
        }

        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
    }
}