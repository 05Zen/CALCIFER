package com.example.calcifer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class Agregar extends AppCompatActivity {

    EditText Nombre;
    Button AgregarD;
    Spinner Area;
    Spinner Sala;
    Spinner Tipo;
    FirebaseDatabase db;
    Reference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        Nombre = findViewById(R.id.NombreD);
        Area = findViewById(R.id.spnArea);
        Sala = findViewById(R.id.spnSala);
        Tipo = findViewById(R.id.spnTipo);
        AgregarD = findViewById(R.id.btnAgregarD);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
    }

}