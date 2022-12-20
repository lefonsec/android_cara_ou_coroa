package com.empresa.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagemMoeda;
    private ImageView imagemVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemMoeda = findViewById(R.id.imageMoeda);
        imagemVoltar = findViewById(R.id.imageVoltar);

        //Recupera dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){
            imagemMoeda.setImageResource(R.drawable.moeda_cara);
        }else{
            imagemMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        imagemVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}