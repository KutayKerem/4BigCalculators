package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countDownTimer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Toast.makeText(MainActivity.this, "Hoş Geldiniz...", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                // Intent
                Intent intent = new Intent(MainActivity.this, questionScreen.class);
                startActivity(intent);

            }


        }.start();


        Vote votes = new Vote();
        System.out.println("Değer:" + votes.vote);

        if (votes.vote == 1) {
            Intent intent = new Intent(MainActivity.this, Trabzonspor.class);
            startActivity(intent);

        } else if (votes.vote == 2) {
            Intent intent = new Intent(MainActivity.this, Besiktas.class);
            startActivity(intent);

        } else if (votes.vote == 3) {
            Intent intent = new Intent(MainActivity.this, Galatasaray.class);
            startActivity(intent);

        } else if (votes.vote == 4) {
            Intent intent = new Intent(MainActivity.this, Fenerbahce.class);
            startActivity(intent);


        }
    }
    CountDownTimer countDownTimer2 = new CountDownTimer(3000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(MainActivity.this, questionScreen.class);
            startActivity(intent);
        }
    }.start();





}