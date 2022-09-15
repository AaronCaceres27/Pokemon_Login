package com.example.pokemon_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private String name = "AaronOP";
    private String contra = "12345Aaron";
    MediaPlayer mPlayer;
    ImageButton btnMusica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.TxtNombreUser);
        TextView password =(TextView) findViewById(R.id.TxtPass);
        ImageButton btnPokeball = (ImageButton) findViewById(R.id.BTNPokeball);
        btnPokeball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("AaronOP") && password.getText().toString().equals("12345Aaron")){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }
                else if(username.getText().toString().equals("AaronOP") &&  !password.getText().toString().equals("12345Aaron")){
                    Toast toast = Toast.makeText(MainActivity.this,"Contraseña Incorrecta" , Toast.LENGTH_LONG);toast.show();
                }
                else{
                    String mensaje = "Entrenador no encontrado";
                    Toast toast = Toast.makeText(MainActivity.this,"Entrenador no encontrado", Toast.LENGTH_LONG);toast.show();
                }
            }
        });
        btnMusica= (ImageButton) findViewById(R.id.musica);
        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPlayer != null){
                    mPlayer.release();
                }
                mPlayer = MediaPlayer.create(MainActivity.this,R.raw.cancion);
                mPlayer.seekTo(0);
                mPlayer.start();
            }
        });
    }
    }
