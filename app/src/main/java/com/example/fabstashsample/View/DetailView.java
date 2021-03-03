package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fabstashsample.R;

public class DetailView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ItemListView.ITEMNAME);
        TextView textView =  findViewById(R.id.detailItemtxtView);
        textView.setText(itemName);
    }
}