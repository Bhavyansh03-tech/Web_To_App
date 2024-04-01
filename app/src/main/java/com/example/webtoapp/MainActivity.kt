package com.example.webtoapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.example.webtoapp.ui.theme.WebToAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebToAppTheme {
                WebScreen()
            }
        }
    }
}

@Composable
fun WebScreen() {

    AndroidView(factory = { context ->
        return@AndroidView WebView(context).apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }
    },
        update = {
            it.loadUrl("https://www.niccolomiranda.com")
        }
    )

}