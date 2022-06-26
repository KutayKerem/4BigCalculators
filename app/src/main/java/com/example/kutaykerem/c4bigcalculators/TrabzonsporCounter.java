package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrabzonsporCounter extends AppCompatActivity {


    TextView sonuc;
    TextView counterGet;
    int counterGetAll;
    int stopCountDownTimer = 0;
    int startCountDownTimer = 0;
    Button startButton;
    CountDownTimer countDownTimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabzonspor_counter);

        sonuc = findViewById(R.id.sonuc);
        counterGet = findViewById(R.id.counterGet);
        startButton = (Button) findViewById(R.id.back);


    }

    public void start(View view ){
        counterGetAll = Integer.parseInt(counterGet.getText().toString() + "000");

        startCountDownTimer =1;




            countDownTimer = new CountDownTimer (counterGetAll,1000) {
                @Override
                public void onTick(long millisUntilFinished  ) {
                    sonuc.setText("" +millisUntilFinished / 1000);

                    startButton.setEnabled(false);


                }

                @Override
                public void onFinish() {
                    sonuc.setText("0");
                    startButton.setEnabled(true);

                }
            }.start();


        }





    public void clear(View view){


        counterGet.setText("");
        counterGetAll = 0;
        countDownTimer.onFinish();

    }

    public void back(View view){
        Intent intent = new Intent(TrabzonsporCounter.this,Trabzonspor.class);
        startActivity(intent);

    }










}