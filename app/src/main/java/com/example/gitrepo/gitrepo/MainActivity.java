package com.example.gitrepo.gitrepo;

import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_service_button).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(AUDIO_SERVICE);
        audioManager.setBluetoothScoOn(true);
        audioManager.startBluetoothSco();
        if (audioManager.isBluetoothScoOn()){
            Toast.makeText(this,"isBluetoothScoOn",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"isBluetoothScoOff",Toast.LENGTH_LONG).show();

        }

    }
}
