package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    public Spinner menuSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menuSpinner=findViewById(R.id.menuspiner);
        ArrayList<String> listaOpciones = new ArrayList<>();
        listaOpciones.add("Cerrar sesion");
        listaOpciones.add(("Quienes somos"));
        listaOpciones.add("Opciones");

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Opciones, android.R.layout.simple_spinner_item);
        menuSpinner.setAdapter(adapter);
        menuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + listaOpciones.get(0).toString(),
                            Toast.LENGTH_LONG).show();
                    FirebaseAuth.getInstance().signOut();
                    Intent i = new Intent(getApplicationContext(), IniciarSesionActivity.class);
                    startActivity(i);
                    parent.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });

    }
    public void atras (View view){
        onBackPressed();
    }

}