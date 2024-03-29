package com.example.epicsOfBharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String data[]={"About","Ramayana","Mahabharata"};
    int pic[]={R.drawable.picabout,R.drawable.picramayana,R.drawable.picmahabharata};
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
                        Intent intent01 = new  Intent(getBaseContext(), RamayanaActivity.class);
                        startActivity(intent01);
                        break;
                    case 2:
                        Intent intent10 = new  Intent(getBaseContext(), MahabharataActivity.class);
                        startActivity(intent10);
                        break;
                }
            }
        });
    }
}