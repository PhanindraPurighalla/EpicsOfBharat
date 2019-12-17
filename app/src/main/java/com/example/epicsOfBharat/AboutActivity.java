package com.example.epicsOfBharat;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView = (WebView) findViewById(R.id.webview00);
        String about = "<html> <body> <h2> About Epics of Bharat </h2> <p>  Epics of Bharat is an online platform for ...</p> </body> </html>";
        webView.loadData(about, "text/html", "UTF-8");
    }
}