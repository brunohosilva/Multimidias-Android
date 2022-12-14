package com.example.mapasmultimidias

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_webview.*

class Webview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        id_webview.webViewClient = object : WebViewClient() {
            // configuracao do carregamento da pagina na webview
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                if(request?.url != null) {
                    view?.loadUrl(request.url.toString())
                }
                return true
            }
        }
        // habilta o javascript da webview
        id_webview.settings.javaScriptEnabled = true
        // url a ser carregada
        id_webview.loadUrl("https://www.fiap.com.br/")
    }
}