package com.example.mapasmultimidias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recuperando_img.setOnClickListener(){
            acessarFoto()
        }

        webview_use.setOnClickListener(){
            acessarwebView()
        }

        sons_audio.setOnClickListener(){
            acessarAudio()
        }

        videos_media_player.setOnClickListener(){
            acessarVideoMediaPlayer()
        }

        animacao_view.setOnClickListener(){
            acessarAnimacao()
        }
    }

    fun acessarFoto() {
        val intent = Intent(this, RecuperaFoto::class.java)
        startActivity(intent)
    }

    fun acessarwebView() {
        val intent = Intent(this, Webview::class.java)
        startActivity(intent)
    }

    fun acessarAudio() {
        val intent = Intent(this, SonsAudio::class.java)
        startActivity(intent)
    }

    fun acessarVideoMediaPlayer() {
        val intent = Intent(this, VideoMediaPlayer::class.java)
        startActivity(intent)
    }

    fun acessarAnimacao(){
        val intent = Intent(this, Animation::class.java)
        startActivity(intent)
    }
}