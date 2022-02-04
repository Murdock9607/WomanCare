package Aplimovil.womancare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class comienzo extends AppCompatActivity {
    VideoView videoCabello,videoPiel;
    MediaController mediaController,mediaController2;
    int posicion=0,posicion1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_DayNight_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comienzo);

        videoPiel=findViewById(R.id.videoPiel);
        videoCabello= findViewById(R.id.videoCabello);
        String path ="android.resource://"+getPackageName()+"/"+R.raw.cuidadocabello;
        String path1 = "android.resource://"+getPackageName()+"/"+R.raw.pieltiene;
        videoCabello.setVideoURI(Uri.parse(path));
        videoPiel.setVideoURI(Uri.parse(path1));


        if(this.mediaController==null)
        {
            this.mediaController=new MediaController(comienzo.this);
            this.mediaController.setAnchorView(videoCabello);
            this.videoCabello.setMediaController(mediaController);

        }

        if(this.mediaController2==null)
        {
            this.mediaController2=new MediaController(comienzo.this);
            this.mediaController2.setAnchorView(videoPiel);
            this.videoPiel.setMediaController(mediaController2);
        }
        this.videoCabello.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoCabello.seekTo(posicion);
                if (posicion==0){
                    videoCabello.start();
                    if (posicion==7)
                    {
                        videoPiel.start();
                    }
                }
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController.setAnchorView(videoCabello);
                    }
                });

            }
        });
    }
    public void comienzo(View view){
        Intent comenzar = new Intent(this, IniciarSesionActivity.class);
        startActivity(comenzar);
    }

}