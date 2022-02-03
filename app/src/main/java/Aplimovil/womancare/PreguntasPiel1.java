package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.StringBufferInputStream;
import java.util.ArrayList;

public class PreguntasPiel1 extends AppCompatActivity {

    Spinner estadoP, porosP, imperfeccionP, sequedadP, arrugasP, solP, cuantasP,primeraP;
    int resultipo, inicioSeca=0, inicioNomal=0, inicioGrasa=0, contRespuestas=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_piel1);

        estadoP = (Spinner) findViewById(R.id.estadoPiel);
        porosP = (Spinner) findViewById(R.id.poros);
        imperfeccionP = (Spinner) findViewById(R.id.imperfeccion);
        sequedadP = (Spinner) findViewById(R.id.sequedad);
        solP = (Spinner) findViewById(R.id.sol);
        cuantasP= (Spinner) findViewById(R.id.cuantasL);
        primeraP = (Spinner) findViewById(R.id.primera);

        ArrayList<String> estadoList= new ArrayList<String >();
        estadoList.add("Seleccione");
        estadoList.add("Seca, aspera");
        estadoList.add("Muy brillante");
        estadoList.add("Normal, unas zonas mas hidratadas");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,estadoList);
        estadoP.setAdapter(adapter);

        estadoP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1||parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==4){
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioGrasa=inicioGrasa+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioNomal=inicioNomal+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> poroslist= new ArrayList<String>();
        poroslist.add("Seleccione");
        poroslist.add("Totalmente invisibles");
        poroslist.add("En unas zonas muy visibles");
        poroslist.add("Abiertos y vibles");

        ArrayAdapter<CharSequence>adapter1=new ArrayAdapter(this, android.R.layout.simple_spinner_item,poroslist);
        porosP.setAdapter(adapter1);

        porosP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3) {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioGrasa=inicioGrasa+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioNomal=inicioNomal+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioSeca=inicioSeca+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> imperfeccionList= new ArrayList<String>();
        imperfeccionList.add("Seleccione");
        imperfeccionList.add("Sí, siempre tengo");
        imperfeccionList.add("No, casi nunca me salen");
        imperfeccionList.add("De vez en cuando, en mis días sobretodo");

        ArrayAdapter<CharSequence>adapter2=new ArrayAdapter(this, android.R.layout.simple_spinner_item,imperfeccionList);
        imperfeccionP.setAdapter(adapter2);

        imperfeccionP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1 || parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3)
                {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioGrasa=inicioGrasa+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioNomal=inicioNomal+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> sequedadList = new ArrayList<String>();
        sequedadList.add("Seleccione");
        sequedadList.add("Sí, tiene aspecto descamado");
        sequedadList.add("A veces, sobre todo en mejillas");
        sequedadList.add("No, Siempre está humectada y brillante");

        ArrayAdapter<CharSequence>adapter3=new ArrayAdapter(this, android.R.layout.simple_spinner_item,sequedadList);
        sequedadP.setAdapter(adapter3);

        sequedadP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1|| parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3)
                {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioNomal=inicioNomal+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioGrasa=inicioGrasa+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> solList= new ArrayList<String>();
        solList.add("Seleccione");
        solList.add("Suele enrojecerse");
        solList.add("Se irrita mucho");
        solList.add("Cojo rápidamente color");

        ArrayAdapter<CharSequence>adapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,solList);
        solP.setAdapter(adapter5);

        solP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1|| parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3)
                {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioNomal=inicioNomal+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioGrasa=inicioGrasa+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> cuantasList = new ArrayList<>();
        cuantasList.add("Seleccione");
        cuantasList.add("Sólo cuando me baño");
        cuantasList.add("Continuamente, mi piel lo necesita");
        cuantasList.add("Dos veces, en la mañana y noche");

        ArrayAdapter<CharSequence>adapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,cuantasList);
        cuantasP.setAdapter(adapter6);

        cuantasP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1|| parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3)
                {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1)
                {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==2)
                {
                    inicioGrasa=inicioGrasa+1;
                }
                if (parent.getLastVisiblePosition()==3)
                {
                    inicioNomal=inicioNomal+1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> primeraList = new ArrayList<>();
        primeraList.add("Seleccione");
        primeraList.add("Suave e hidratada");
        primeraList.add("Seca");
        primeraList.add("Brillante en la zona T");

        ArrayAdapter<CharSequence>adapter7 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,primeraList);
        primeraP.setAdapter(adapter7);

        primeraP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getLastVisiblePosition()==1|| parent.getLastVisiblePosition()==2 || parent.getLastVisiblePosition()==3)
                {
                    contRespuestas=contRespuestas+1;
                }
                if (parent.getLastVisiblePosition()==1) {
                    inicioGrasa=inicioGrasa+1;
                }
                if (parent.getLastVisiblePosition()==2) {
                    inicioSeca=inicioSeca+1;
                }
                if (parent.getLastVisiblePosition()==3) {
                    inicioNomal=inicioNomal+1;
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
        if (inicioSeca>=4) {
            resultipo = 1;
        }

        if (inicioGrasa>=4){
            resultipo=2;
        }

        if (inicioNomal>=4){
            resultipo=3;
        }
        if(contRespuestas>6) {
            Intent ResultadoHS = new Intent(this, resultadosskin.class);
            ResultadoHS.putExtra("resultipoenviar", resultipo);
            startActivity(ResultadoHS);
        }
    }

}
