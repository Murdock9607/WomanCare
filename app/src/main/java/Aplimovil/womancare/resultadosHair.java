package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class resultadosHair extends AppCompatActivity {
    PreguntasCabello1 respuesta1;
    PreguntasCabello1 respuesta2;
    TextView Resultado;
    ImageView imagResult;
    int resulCabello,resulCu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_hair);
        Resultado = findViewById(R.id.cabello);
        imagResult = findViewById(R.id.imageCabello);
        respuesta1 = new PreguntasCabello1();
        respuesta2 = new PreguntasCabello1();
        Resultado.setText("Sin Resultado");
        Bundle bundle = this.getIntent().getExtras();
        resulCabello=bundle.getInt("resultipoenviar");
        resulCu=bundle.getInt("cuidadotipoenviar");

        if (resulCabello==1 && resulCu==1){
            Resultado.setText("Seco Muy maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.seco));

        }
        if (resulCabello==1 && resulCu==2){
            Resultado.setText("Seco Maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.seco));

        }

        if (resulCabello==1 && resulCu==3){
            Resultado.setText("Seco Sano");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.seco));
        }
        if (resulCabello==2 && resulCu==1){
            Resultado.setText("Graso Muy maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.graso));

        }
        if (resulCabello==2 && resulCu==2){
            Resultado.setText("Graso Maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.graso));

        }

        if (resulCabello==2 && resulCu==3){
            Resultado.setText("Graso Sano");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.graso));
        }
        if (resulCabello==3 && resulCu==1){
            Resultado.setText("Normal Muy maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.cabellonormal));

        }
        if (resulCabello==3 && resulCu==2){
            Resultado.setText("Normal Maltratado");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.cabellonormal));

        }

        if (resulCabello==3 && resulCu==3){
            Resultado.setText("Normal Sano");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.cabellonormal));
        }
    }
    public void atras (View view){
        onBackPressed();
    }
    public void aSuscripcion(View view){
        Intent suscripcion = new Intent(this, errorsuscripcionActivity.class);
        startActivity(suscripcion);
    }
}