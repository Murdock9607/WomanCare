package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class planesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes);
    }
    public void atras (View view){
        onBackPressed();
    }
    public void results (View view){
        Intent i = new Intent(getApplicationContext(), planesActivity.class);
        startActivity(i);
    }
}