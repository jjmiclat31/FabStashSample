package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.fabstashsample.ControlOrPresent.CategoryPresenter;
import com.example.fabstashsample.ControlOrPresent.ICategoryPresenter;
import com.example.fabstashsample.R;

public class MainActivity extends AppCompatActivity implements ICategoryView {
    ExpandableListView expandableListView;
    ICategoryPresenter presenter;
    CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expListView);
        presenter = new CategoryPresenter(this);
        adapter = new CategoryAdapter(presenter.getListGroup(),presenter.getListChild());
        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                final String selectedItem = (String) adapter.getChild(groupPosition,childPosition);
                Intent intent = new Intent(MainActivity.this, ItemListView.class);
                intent.putExtra(ITEMNAME, selectedItem);
                startActivity(intent);
                return true;
            }
        });



    }

}