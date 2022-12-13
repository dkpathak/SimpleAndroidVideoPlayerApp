package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.StyledPlayerView


class MyTestActivity : AppCompatActivity() {

    lateinit var playerView: StyledPlayerView
    lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playerView = findViewById(R.id.player_view)
        initializePlayer()
    }

     private fun initializePlayer(): Boolean {
        player = ExoPlayer.Builder(this).build()
         player.repeatMode = Player.REPEAT_MODE_ALL
        playerView?.player = player
        playerView?.useController = false
        val mediaItem: MediaItem = MediaItem.fromUri("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4")
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
        return true
    }





}