package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private   ListView lista;
    private   List<String> estudiantes;
    Button btnFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.listView);
        setTitle("Lista de Cursos Matriculados");
        // 2. Instanciamos la Lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Desarrollo de Aplicaciones para Moviles");
        estudiantes.add("Sistemas de Informacion");
        estudiantes.add("Sistemas Operativos");
        estudiantes.add("Ingenieria de Software ");
        estudiantes.add("Sistemas Intelgentes");
        estudiantes.add("Redes Informaticas I");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );

        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);
        btnFinalizar = findViewById(R.id.buttonFinalizar);
        btnFinalizar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonFinalizar){
            Toast.makeText(this,"Matricula Completada",Toast.LENGTH_LONG).show();
        }
    }
}