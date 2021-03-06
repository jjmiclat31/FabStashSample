package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.fabstashsample.ControlOrPresent.IItemListPresenter;
import com.example.fabstashsample.ControlOrPresent.ItemListPresenter;
import com.example.fabstashsample.R;

public class ItemListView extends AppCompatActivity implements IItemListView {

    ListView listView;
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(ItemListView.this, DetailView.class);
                intent.putExtra(ITEMNAME, selectedItem);
                startActivity(intent);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return  true;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}



