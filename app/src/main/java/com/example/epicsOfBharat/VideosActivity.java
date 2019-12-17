package com.example.epicsOfBharat;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class VideosActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView = (WebView) findViewById(R.id.webview00);
        String videos = "<html> <body> <h2> Videos </h2> <p>  Videos ...</p> </body> </html>";
        webView.loadData(videos, "text/html", "UTF-8");
    }
}