package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fabstashsample.ControlOrPresent.IItemListPresenter;
import com.example.fabstashsample.ControlOrPresent.ItemListPresenter;
import com.example.fabstashsample.Data.IItemListData;
import com.example.fabstashsample.R;

public class ItemListView extends AppCompatActivity implements IItemListView {

    ListView listView;
    //String[] dataTitles = {"Cotton", "Wool"};
    //String[] dataDescriptions = {"Cotton Description", "Wool Description"};
    IItemListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_view);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra(MainActivity.ITEMNAME);
        TextView textView = findViewById(R.id.itemName);
        textView.setText(itemName);


        listView = findViewById(R.id.itemListView);
        presenter = new ItemListPresenter(this);
        presenter.selectedItem(itemName);
        ItemListAdapter adapter = new ItemListAdapter(this,
                presenter.getDataTitlesFromData(), presenter.getDataDescriptionsFromData());
        listView.setAdapter(adapter);


    }

}



