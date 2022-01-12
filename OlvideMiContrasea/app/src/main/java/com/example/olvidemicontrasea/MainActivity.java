package com.example.olvidemicontrasea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

   private EditText gmail;
   private Button RecuperarContraseña;

   private String email ="";

   private FirebaseAuth mAuth;

   private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialog = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();

        gmail =(EditText) findViewById(R.id.gmail);
        RecuperarContraseña =(Button) findViewById(R.id.RecuperarContraseña);

        RecuperarContraseña.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            email = gmail.getText().toString();

            if (!email.isEmpty()) {
                mDialog.setMessage("Espere un momento...");
                mDialog.setCanceledOnTouchOutside(false);
                mDialog.show();
                resetPassword();
            }
            else {
                Toast.makeText(MainActivity.this,"Debe ingresar el email"Toast.LENGTH_SHORT).show();
            }
        }
    });


    }

public void resetPassword (){
        mAuth.setLanguageCode("es");
    Task<Void> voidTask = mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
        @Override
        public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<Void> task) {
            if (task.isSuccessful()) {
                Toast.makeText(MainActivity.this, "Se ha enviado un correo para restablecer tu contraseña", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No se pudo enviar el correo de restablecer contraseña", Toast.LENGTH_SHORT).show();
            }
            mDialog.dismiss();
        }
    });

}
}