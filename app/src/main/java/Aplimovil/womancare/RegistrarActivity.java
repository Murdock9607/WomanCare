package Aplimovil.womancare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrarActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText correo;
    private EditText contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mAuth = FirebaseAuth.getInstance();
        correo=findViewById(R.id.correoUsuario1);
        contrasena=findViewById((R.id.contrasena1));
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        //FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void crearCuenta(View view){
        mAuth.createUserWithEmailAndPassword(correo.getText().toString(), contrasena.getText().toString())
                        .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information
                        //Log.d(TAG, "createUserWithEmail:success");
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(getApplicationContext(), "Autenticación exitosa.",
                                Toast.LENGTH_SHORT).show();
                        Intent i =  new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(i);
                        //updateUI(user);
                    } else {
                        // If sign in fails, display a message to the user.
                        //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                        Toast.makeText(getApplicationContext(), "Authenticación fallida.",
                                Toast.LENGTH_SHORT).show();
                        //updateUI(null);
                    }

                    // ...
                });
    }
    public void atras (View view){
        onBackPressed();
    }
}