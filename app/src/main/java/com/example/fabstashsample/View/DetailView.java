package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fabstashsample.R;

public class DetailView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ItemListView.ITEMNAME);

        if (itemName.contains("Cotton")) {
            setContentView(R.layout.activity_detail_view_fabric);
        }
        else {
            setContentView(R.layout.activty_detail_view_notion);
        }

        //TextView textView =  findViewById(R.id.detailItemtxtView);
        //textView.setText(itemName);
    }

    public void editView(View view) {
        setContentView(R.layout.edit_view_layout_fabric);
    }


    public void cancelEdit(View view) {
        setContentView(R.layout.activity_detail_view_fabric);
    }

}