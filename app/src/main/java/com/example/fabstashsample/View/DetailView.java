package com.example.fabstashsample.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fabstashsample.R;

public class DetailView extends AppCompatActivity {

    EditText editNotes;
    TextView notes;
    String layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ItemListView.ITEMNAME);

        if (itemName.contains("Cotton") || itemName.contains("Wool")) {
            setContentView(R.layout.activity_detail_view_fabric);
            layout = "fabric";
        }
        else {
            setContentView(R.layout.activty_detail_view_notion);
            layout = "notion";
        }

    }

    public void editViewF() {
        setContentView(R.layout.edit_view_layout_fabric);
    }

    public void editViewN() {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.detail_view_menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.IDKID:

                return true;
            case R.id.EditID:
                if (layout == "fabric") {
                    editViewF();
                }
                if (layout == "notion") {
                    editViewN();
                }

                return true;
            case R.id.DeleteID:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}