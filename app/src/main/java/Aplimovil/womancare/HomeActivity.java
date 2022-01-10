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

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    public Spinner menuSpinner;
    FragmentTransaction transaction;
    Fragment quienesSomos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menuSpinner=findViewById(R.id.menuspiner);
        ArrayList<String> listaOpciones = new ArrayList<>();
        listaOpciones.add("Cerrar sesion");
        listaOpciones.add(("Quienes somos"));
        listaOpciones.add("Opciones");
        quienesSomos = new quienesSomosFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragments,quienesSomos).commit();

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
                if(parent.getLastVisiblePosition()==2) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + listaOpciones.get(1).toString(),
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), quienessomosActivity.class);
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
    public void pantHair (View view){
        Intent preguntasHC = new Intent(this,HairCare1.class);
        startActivity(preguntasHC);
    }

    public void pantSkin (View view){
        Intent preguntasSC = new Intent(this,SkinCare1.class);
        startActivity(preguntasSC);
    }

}