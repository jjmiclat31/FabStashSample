package com.example.fabstashsample.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;


import com.example.fabstashsample.R;

public class ItemListAdapter extends ArrayAdapter<String> {

    Context context;
    String[] dataTitles;
    String[] dataDescriptions;
    String intent;

    public ItemListAdapter(Context context, String[] dataTitles, String[] dataDescriptions) {
        super(context, R.layout.items_in_list, R.id.textView1,dataTitles);
        this.context = context;
        this.dataTitles = dataTitles;
        this.dataDescriptions = dataDescriptions;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemsList = convertView;
        ItemListHolder holder = null;
        if(itemsList == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemsList = layoutInflater.inflate(R.layout.items_in_list,parent,false);
            holder = new ItemListHolder(itemsList);
            itemsList.setTag(holder);
        }
        else {
            holder = (ItemListHolder) itemsList.getTag();
        }
        holder.itemTitle.setText(dataTitles[position]);
        holder.itemDescription.setText(dataDescriptions[position]);
        intent = dataTitles[position];
        /*itemsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),dataTitles[position],Toast.LENGTH_SHORT).show();
            }
        });*/
        return itemsList;
    }

    public String getIntent() {
        return intent;
    }
}
