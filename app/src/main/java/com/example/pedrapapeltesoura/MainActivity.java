package com.example.pedrapapeltesoura;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantidadeDolar;
    TextView textOpcaoJogador;
    ImageView imgPedra, imgPapel, imgTesoura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edtValorDolar = findViewById(R.id.edtValorDolar);
        //edtQuantidadeDolar = findViewById(R.id.edtQuantidadeDolar);
        textOpcaoJogador = findViewById(R.id.textOpcaoJogador);
        imgPedra = findViewById(R.id.imgPedra);
        imgTesoura = findViewById(R.id.imgTesoura);
        imgPapel = findViewById(R.id.imgPapel);

    }

    public void selecionadoPedra(View view) {
        imgPedra.setColorFilter(3_169_244);
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void opcaoSelecionada(String opcaSelecioanada) {

        //textOpcaoJogador.setText(opcaSelecioanada);
        ImageView imgRobo = findViewById(R.id.imgRobo);
        int jogadaRobo = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String[] mensagens = {"EMPAAAAATEEE!!!", "Booa magrão, você Ganhou!", "Robo ganhou... Só chora!!"};
        String opcaoApp = opcoes[ jogadaRobo ];

        switch (opcaoApp) {

            case "Pedra":
                imgRobo.setImageResource(R.drawable.pedra);

                if (opcaSelecioanada == "Pedra") {
                    textOpcaoJogador.setText(mensagens[0]);}
                else if (opcaSelecioanada == "Papel") {
                    textOpcaoJogador.setText(mensagens[1]);}
                else if (opcaSelecioanada == "Tesoura") {
                textOpcaoJogador.setText(mensagens[2]);}
                break;


            case "Papel":
                imgRobo.setImageResource(R.drawable.papel);

                if (opcaSelecioanada == "Pedra") {
                textOpcaoJogador.setText(mensagens[2]);}
                else if (opcaSelecioanada == "Papel") {
                textOpcaoJogador.setText(mensagens[0]);}
                else if (opcaSelecioanada == "Tesoura") {
                textOpcaoJogador.setText(mensagens[1]);}
                break;

            case "Tesoura":
                imgRobo.setImageResource(R.drawable.tesoura);

                if (opcaSelecioanada == "Pedra") {
                textOpcaoJogador.setText(mensagens[1]);}
                else if (opcaSelecioanada == "Papel") {
                textOpcaoJogador.setText(mensagens[2]);}
                else if (opcaSelecioanada == "Tesoura") {
                textOpcaoJogador.setText(mensagens[0]);}
                break;
            }
        }
    }


