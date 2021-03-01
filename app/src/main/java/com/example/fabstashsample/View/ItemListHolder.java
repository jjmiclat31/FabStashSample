package com.example.fabstashsample.View;

import android.view.View;
import android.widget.TextView;

import com.example.fabstashsample.R;

public class ItemListHolder {
    TextView itemTitle;
    TextView itemDescription;
    ItemListHolder(View v) {
        itemTitle = v.findViewById(R.id.textView1);
        itemDescription = v.findViewById(R.id.textView2);

    }
}
