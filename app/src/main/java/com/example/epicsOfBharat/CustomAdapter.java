package com.example.epicsOfBharat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String data[];
    int pic[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] data, int[] pic) {
        this.data = data;
        this.context = context;
        this.pic = pic;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_listview, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textView.setText(data[i]);
        imageView.setImageResource(pic[i]);
        return view;
    }
}