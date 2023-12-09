package com.example.calcifer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Login";
    private String Usuario;
    private EditText txtUsuario;
    private String Contrasena;
    private EditText txtContrasena;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    private void initialise(){
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
        mAuth = FirebaseAuth.getInstance();
    }

    private void loginUser(){
        Usuario = txtUsuario.getText().toString();
        Contrasena = txtContrasena.getText().toString();

        if (!TextUtils.isEmpty(Usuario) && !TextUtils.isEmpty(Contrasena)){

            mAuth.signInWithEmailAndPassword(Usuario, Contrasena).addOnCompleteListener(this, task ->{
                if (task.isSuccessful()){
                    goHome();
                } else {
                    Toast.makeText(MainActivity.this, "Autenticacion fallida.", Toast.LENGTH_SHORT).show();
                }

            });
        } else {
            Toast.makeText(MainActivity.this, "Enter all details", Toast.LENGTH_SHORT).show();
        }

    }

    private void goHome(){
        Toast.makeText(MainActivity.this, "Autenticacion exitosa.", Toast.LENGTH_SHORT).show();
    }
    public void login(View view){
        loginUser();
    }
}