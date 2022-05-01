package com.example.inventario;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    private ArrayList productos;
    private ArrayAdapter adaptador1;
    private ListView lv1;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        productos = new ArrayList();

        productos.add("Ejemplo:Pantalones");
        adaptador1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, productos);
        lv1 = findViewById(R.id.lv1);
        lv1.setAdapter(adaptador1);

        et1 = findViewById(R.id.et1);
    }

    public void agregar (View v) {
        productos.add(et1.getText().toString());
        adaptador1.notifyDataSetChanged();
        et1.setText("");
    }

    public void regresar(View v){
        finish();
    }
}
