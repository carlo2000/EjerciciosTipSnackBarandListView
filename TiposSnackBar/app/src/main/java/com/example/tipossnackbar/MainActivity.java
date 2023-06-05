package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnackBarShort, btnSnackBarLong,btnSnackBarUndifine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackBarShort = findViewById(R.id.buttonSnackBarShort);
        btnSnackBarLong = findViewById(R.id.buttonSnackBarLong);
        btnSnackBarUndifine = findViewById(R.id.buttonSnackBarUndefine);
        btnSnackBarShort.setOnClickListener(this);
        btnSnackBarLong.setOnClickListener(this);
        btnSnackBarUndifine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonSnackBarShort){
            Snackbar.make(v,"Mensaje de un SnackBar Short",Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.buttonSnackBarLong){
            Snackbar.make(v,"Mensaje de un SnackBar Long",Snackbar.LENGTH_LONG).show();
        }
        if(v.getId()==R.id.buttonSnackBarUndefine){
            Snackbar.make(v,"Mensaje de un SnackBar Indefinite",Snackbar.LENGTH_INDEFINITE).show();
        }


    }
}