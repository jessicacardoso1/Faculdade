package com.example.faculdade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_disciplinas_layout);

        String[] disciplinas = {"Redes", "Algoritmos", "Programacao"};

        int layout = android.R.layout.simple_list_item_1;

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,layout, disciplinas);

        ListView lista = (ListView) findViewById(R.id.listView);

        lista.setAdapter(adapter);
    }

}