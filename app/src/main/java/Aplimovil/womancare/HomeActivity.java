package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
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
                //FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if(parent.getLastVisiblePosition()==1) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + listaOpciones.get(0).toString(),
                            Toast.LENGTH_LONG).show();
                    FirebaseAuth.getInstance().signOut();
                    Intent i = new Intent(getApplicationContext(), IniciarSesionActivity.class);
                    startActivity(i);
                    parent.setSelection(0);
                }
                if(parent.getLastVisiblePosition()==2) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + listaOpciones.get(1).toString(),
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), quienessomosActivity.class);
                    startActivity(i);
                    //transaction.replace(R.id.contenedorfragments, quienesSomos);
                    parent.setSelection(0);
                }
                //transaction.commit();

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
    public void pantHair (View view){
        Intent preguntasHC = new Intent(this,PreguntasCabello1.class);
        startActivity(preguntasHC);
    }

    public void pantSkin (View view){
        Intent preguntasSC = new Intent(this,PreguntasPiel1.class);
        startActivity(preguntasSC);
    }

}