package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HairCare1 extends AppCompatActivity {

    Spinner CepilladoP,grueso,diasLavado,estructuraC,tratamientoC,instrumentosC,ahoraC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_care1);

        CepilladoP=findViewById(R.id.peinar);
        grueso=findViewById(R.id.grosor);
        diasLavado=findViewById(R.id.lavado);
        estructuraC=findViewById(R.id.estructura);
        tratamientoC=findViewById(R.id.tratamientoQ);
        instrumentosC=findViewById(R.id.elementos);
        ahoraC=findViewById(R.id.estado);



    }
    public void Peinado(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Cepillar, android.R.layout.simple_spinner_item);
        CepilladoP.setAdapter(adapter);
    }
    public void CargaGrueso(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Grosor, android.R.layout.simple_spinner_item);
        grueso.setAdapter(adapter);
    }

    public void CargaLavado(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.lavadoCa, android.R.layout.simple_spinner_item);
        diasLavado.setAdapter(adapter);
    }

    public void Cargaestructura(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Estructura, android.R.layout.simple_spinner_item);
        estructuraC.setAdapter(adapter);
    }
    public void CargaTratamiento(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Tratamiento, android.R.layout.simple_spinner_item);
        tratamientoC.setAdapter(adapter);
    }

    public void CargaElementos(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Elementos, android.R.layout.simple_spinner_item);
        instrumentosC.setAdapter(adapter);
    }

    public void CargaEstado(){
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.ComoEsta, android.R.layout.simple_spinner_item);
        ahoraC.setAdapter(adapter);
    }

    public void anterior(View view){
        Intent anterior = new Intent(this,HomeActivity.class);
        startActivity(anterior);

    }
    public void tipoCabello(View view){
        Intent tipoCabello = new Intent(this,tipoHair.class);
        startActivity(tipoCabello);}

}