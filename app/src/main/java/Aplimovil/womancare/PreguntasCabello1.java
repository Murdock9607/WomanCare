package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class PreguntasCabello1 extends AppCompatActivity {
    Spinner CepilladoP,grueso,diasLavado,estructuraC,tratamientoC,instrumentosC,ahoraC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_cabello1);

        CepilladoP = (Spinner) findViewById(R.id.idpeinar);
        grueso = (Spinner) findViewById(R.id.idgrosor);
        diasLavado = (Spinner) findViewById(R.id.idlavado);
        estructuraC = (Spinner) findViewById(R.id.idestructura);
        tratamientoC = (Spinner) findViewById(R.id.idtratamientoQ);
        instrumentosC = (Spinner) findViewById(R.id.idelementos);
        ahoraC = (Spinner) findViewById(R.id.idestado);

        ArrayList<String> lavadoList = new ArrayList<String>();
        lavadoList.add("Seleccione");
        lavadoList.add("2 días a la semana");
        lavadoList.add("Una vez a la semana");
        lavadoList.add("Todos los días");
        lavadoList.add("Día de por medio");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lavadoList);
        diasLavado.setAdapter(adapter);

        diasLavado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3 || parent.getLastVisiblePosition()==4) {
                   Toast.makeText(parent.getContext(),
                           "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
               }

    }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> cepillarList = new ArrayList<String>();
        cepillarList.add("Seleccione");
        cepillarList.add("Sí,siempre es fácil");
        cepillarList.add("A veces");
        cepillarList.add("No, es muy difícil");

        ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, cepillarList);
        CepilladoP.setAdapter(adapter1);
        CepilladoP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> estructuraList = new ArrayList<String>();
        estructuraList.add("Seleccione");
        estructuraList.add("Ondulado");
        estructuraList.add("Liso");
        estructuraList.add("Crespo");

        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, estructuraList);
        estructuraC.setAdapter(adapter2);
        estructuraC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> GrosorList = new ArrayList<String>();
        GrosorList.add("Seleccione");
        GrosorList.add("Grueso");
        GrosorList.add("Normal");
        GrosorList.add("Delgado");

        ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,GrosorList);
        grueso.setAdapter(adapter3);
        grueso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String>TratamientoList = new ArrayList<String>();
        TratamientoList.add("Seleccione");
        TratamientoList.add("Keratina");
        TratamientoList.add("Tinte");
        TratamientoList.add("Decoloraciones");
        TratamientoList.add("Permanentes");
        TratamientoList.add("Niguna de las anteriores");
        TratamientoList.add("Todas las anteriores");

        ArrayAdapter<CharSequence> adapter4= new ArrayAdapter(this, android.R.layout.simple_spinner_item,TratamientoList);
        tratamientoC.setAdapter(adapter4);
        tratamientoC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 ||parent.getLastVisiblePosition()==2 ||parent.getLastVisiblePosition()==3
                        || parent.getLastVisiblePosition()==4 || parent.getLastVisiblePosition()==5 || parent.getLastVisiblePosition()==6) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayList<String> estadoList=new ArrayList<String>();
        estadoList.add("Seleccione");
        estadoList.add("Opaco,seco");
        estadoList.add("Puntas abiertas");
        estadoList.add("Brillante y manejable");
        estadoList.add("Mucho Frizz");
        estadoList.add("Sano");

        ArrayAdapter<CharSequence> adapter5=new ArrayAdapter(this, android.R.layout.simple_spinner_item,estadoList);
        ahoraC.setAdapter(adapter5);
        ahoraC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3
                        || parent.getLastVisiblePosition()==4 || parent.getLastVisiblePosition()==5) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> elementosList = new ArrayList<String >();
        elementosList.add("Seleccione");
        elementosList.add("Plancha");
        elementosList.add("Secador");
        elementosList.add("Ondas");
        elementosList.add("Ninguna de las anteriores");

        ArrayAdapter<CharSequence> adapter6=new ArrayAdapter(this, android.R.layout.simple_spinner_item,elementosList);
        instrumentosC.setAdapter(adapter6);
        instrumentosC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getLastVisiblePosition()==1 ||parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3 || parent.getLastVisiblePosition()== 4) {
                    Toast.makeText(parent.getContext(),
                            "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void atras (View view){
        onBackPressed();
    }

    public void Resultado (View view){
        Intent ResultadHC = new Intent(this,tipoHair.class);
        startActivity(ResultadHC);
    }
}
