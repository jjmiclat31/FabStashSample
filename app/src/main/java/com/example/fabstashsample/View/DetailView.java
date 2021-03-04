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
        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ItemListView.ITEMNAME);

        if (itemName.contains("Cotton")) {
            setContentView(R.layout.activity_detail_view);
        }
        else {
            setContentView(R.layout.detail_view_notion);
        }

        TextView textView =  findViewById(R.id.detailItemtxtView);
        textView.setText(itemName);
    }
}