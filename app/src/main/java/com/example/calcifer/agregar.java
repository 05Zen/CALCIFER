package com.example.calcifer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class agregar extends AppCompatActivity {

    EditText txtNombre;
    Button btnAgregarD;
    Spinner spnArea;
    Spinner spnSala;
    Spinner spnTipo;
    FirebaseDatabase db;
    Reference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);


    }
}