package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String nazioni[] = {"Italia","Francia","Germania","Olanda"};
    ListView ListaStati;
    Button btnEsegui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaStati = (ListView) findViewById(R.id.LvStati);
        btnEsegui = (Button) findViewById(R.id.btnEsegui);

        btnEsegui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hai premuto il tasto", Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, R.layout.activity_main, nazioni);
        ListaStati.setAdapter(aaStati);
    }
}