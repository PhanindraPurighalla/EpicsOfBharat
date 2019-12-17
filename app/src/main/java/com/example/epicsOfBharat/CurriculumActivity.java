package com.example.epicsOfBharat;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class CurriculumActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);
        this.setTitle("Curriculum");
        webView = (WebView) findViewById(R.id.webview01);
        String epicName = getIntent().getStringExtra("EPIC_NAME");
        String curriculum = "<html> <body> <h2> Curriculum for " + epicName + "</h2> <p>  Curriculum ...</p> </body> </html>";
        webView.loadData(curriculum, "text/html", "UTF-8");
    }
}