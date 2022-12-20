package com.empresa.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageJogar = findViewById(R.id.imageJogar);
    }

    public void jogar(View view){

        //rota para mudar de tela
        Intent intent = new Intent(getApplicationContext(),ResultadoActivity.class);
        //passar dados para proxima tela;
        int numero = new Random().nextInt(2);
        intent.putExtra("numero",numero);

        startActivity(intent);
        //
    }
}