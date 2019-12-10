package com.example.ourfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class SelectSetting extends AppCompatActivity {
    int index = 0;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chunk_setting);

        Spinner musicList = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.songs_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        musicList.setAdapter(adapter);

        musicList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(final AdapterView<?> parent, final View view,
                                       final int position, final long id) {
                index = position;
                Intent intent = new Intent();
                intent.putExtra("index", index);
            }
            @Override
            public void onNothingSelected(final AdapterView<?> parent) {
            }
        });


        Button select = findViewById(R.id.Setting);
        select.setOnClickListener(unused -> {
            Intent jump = new Intent(this, MainActivity.class);
            startActivity(jump);
        });
    }
}
