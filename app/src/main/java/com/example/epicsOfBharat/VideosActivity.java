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
        this.setTitle("Videos");
        webView = (WebView) findViewById(R.id.webview00);
        String epicName = getIntent().getStringExtra("EPIC_NAME");
        String videos = "<html> <body> <h2> Videos for " + epicName + "</h2> <p>  Videos ...</p> </body> </html>";
        webView.loadData(videos, "text/html", "UTF-8");
    }
}