package com.example.epicsOfBharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CurriculumActivity extends AppCompatActivity {
    ListView list;
    String data[]={"About","Question Bank", "Videos", "Home"};
    int pic[]={R.drawable.picabout,R.drawable.picquestionbank, R.drawable.picvideos,R.drawable.picabout};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listview);
        CustomAdapter  customAdapter = new  CustomAdapter (getApplicationContext(),data,pic);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent00 = new  Intent(getBaseContext(), AboutActivity.class);
                        startActivity(intent00);
                        break;
                    case 1:
                        Intent intent10 = new  Intent(getBaseContext(), QuestionBankActivity.class);
                        startActivity(intent10);
                        break;
                    case 2:
                        Intent intent11 = new  Intent(getBaseContext(), VideosActivity.class);
                        startActivity(intent11);
                        break;
                    case 3:
                        Intent intent01 = new  Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent01);
                        break;
                }
            }
        });
    }
}