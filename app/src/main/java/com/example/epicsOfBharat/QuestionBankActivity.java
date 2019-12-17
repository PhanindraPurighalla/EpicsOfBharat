package com.example.epicsOfBharat;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionBankActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView = (WebView) findViewById(R.id.webview00);
        String questionBank = "<html> <body> <h2> Question Bank </h2> <p>  Question Bank ...</p> </body> </html>";
        webView.loadData(questionBank, "text/html", "UTF-8");
    }
}