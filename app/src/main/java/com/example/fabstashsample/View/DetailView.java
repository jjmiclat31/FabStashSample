package com.example.fabstashsample.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fabstashsample.R;

public class DetailView extends AppCompatActivity {

    EditText editNotes;
    TextView notes;
    String notes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ItemListView.ITEMNAME);

        if (itemName.contains("Cotton") || itemName.contains("Wool")) {
            setContentView(R.layout.activity_detail_view_fabric);
        }
        else {
            setContentView(R.layout.activty_detail_view_notion);
        }

        //TextView textView =  findViewById(R.id.detailItemtxtView);
        //textView.setText(itemName);
    }

    public void editViewF(View view) {
        setContentView(R.layout.edit_view_layout_fabric);
    }

    public void editViewN(View view) {
        setContentView(R.layout.edit_view_layout_notion);
    }


    public void cancelEdit(View view) {
        setContentView(R.layout.activity_detail_view_fabric);
    }

    public void updateDataF(View view) {
        editNotes = findViewById(R.id.editNotesID);
        notes = (TextView) findViewById(R.id.notesID);
        String notesFromEdit = editNotes.getText().toString();
        setContentView(R.layout.activity_detail_view_fabric);
        ((TextView)findViewById(R.id.notesID)).setText(notesFromEdit);
        Log.d("Success", notesFromEdit);
    }

    public void updateDataN(View view) {
        editNotes = findViewById(R.id.editNotesID);
        notes = (TextView) findViewById(R.id.notesID);
        String notesFromEdit = editNotes.getText().toString();
        setContentView(R.layout.activty_detail_view_notion);
        ((TextView)findViewById(R.id.notesID)).setText(notesFromEdit);
        Log.d("Success", notesFromEdit);
    }

    public void setNotes() {
        notes.setText(notes1);
    }

}