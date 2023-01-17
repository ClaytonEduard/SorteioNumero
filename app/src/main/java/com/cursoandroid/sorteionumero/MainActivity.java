package com.cursoandroid.sorteionumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view) {
        TextView num = findViewById(R.id.txtResposta);
        int x = new Random().nextInt(10);
        num.setText("O Número é: " + x);


    }
}