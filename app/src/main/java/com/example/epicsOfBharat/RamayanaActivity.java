package com.example.epicsOfBharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class RamayanaActivity extends AppCompatActivity {
    ListView list;
    String data[]={"Curriculum","Question Bank", "Videos", "Home"};
    int pic[]={R.drawable.picabout,R.drawable.picquestionbank, R.drawable.picvideos,R.drawable.picabout};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Ramayana");
        list = (ListView) findViewById(R.id.listview);
        CustomAdapter  customAdapter = new  CustomAdapter (getApplicationContext(),data,pic);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent00 = new  Intent(getBaseContext(), CurriculumActivity.class);
                        intent00.putExtra("EPIC_NAME", "Ramayana");
                        startActivity(intent00);
                        break;
                    case 1:
                        Intent intent10 = new  Intent(getBaseContext(), QuestionBankActivity.class);
                        intent10.putExtra("EPIC_NAME", "Ramayana");
                        startActivity(intent10);
                        break;
                    case 2:
                        Intent intent11 = new  Intent(getBaseContext(), VideosActivity.class);
                        intent11.putExtra("EPIC_NAME", "Ramayana");
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