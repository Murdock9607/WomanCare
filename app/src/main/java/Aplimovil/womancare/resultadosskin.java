package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class resultadosskin extends AppCompatActivity {
    PreguntasPiel1 respuestas;
    TextView Resultado;
    ImageView imagResult;
    int resultipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadosskin);
        Resultado = findViewById(R.id.textosalida);
        imagResult = findViewById(R.id.imagePiel);
        respuestas = new PreguntasPiel1();
        Resultado.setText("Sin Resultado");
        Bundle bundle = this.getIntent().getExtras();
        resultipo=bundle.getInt("resultipoenviar");
        if (resultipo==1){
            Resultado.setText("Piel seca");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.pielseca));

        }
        if (resultipo==2){
            Resultado.setText("piel grasa");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.pielgrasa));

        }

        if (resultipo==3){
            Resultado.setText("piel normal");
            imagResult.setImageDrawable(getResources().getDrawable(R.drawable.pielnormal));

        }
        //Toast.makeText(this,respuestas.getText(respuestas.resultipo),Toast.LENGTH_LONG).show();

    }
    public void atras (View view){
        onBackPressed();
    }
    public void aSuscripcion(View view){
        Intent suscripcion = new Intent(this, errorsuscripcionActivity.class);
        startActivity(suscripcion);
    }
}