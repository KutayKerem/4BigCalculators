package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BesiktasAccounts extends AppCompatActivity {

    TextView number;
    TextView number2;
    TextView solution;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besiktas_accounts);

        number = findViewById(R.id.sayi);
        number2 = findViewById(R.id.sayi2);
        solution = findViewById(R.id.sonuc);

    }



    public void tocollect(View view){

        if(number.getText().toString().matches("") || number2.getText().toString().matches("")) {
            solution.setText("Lütfen sayı giriniz !");
        }else{

            int numberGet  = Integer.parseInt(number.getText().toString());
            int number2Get = Integer.parseInt(number2.getText().toString());

            int collection  = numberGet + number2Get;

            solution.setText("Sonuç: " + collection);

        }
    }


    public void extraction(View view){
        if(number.getText().toString().matches("") || number2.getText().toString().matches("")) {
            solution.setText("Lütfen sayı giriniz !");
        }else{

            int numberGet  = Integer.parseInt(number.getText().toString());
            int number2Get = Integer.parseInt(number2.getText().toString());

            int collection  = numberGet - number2Get;

            solution.setText("Sonuç: " + collection);

        }
    }


    public void bump(View view){
        if(number.getText().toString().matches("") || number2.getText().toString().matches("")) {
            solution.setText("Lütfen sayı giriniz !");
        }else{

            int numberGet  = Integer.parseInt(number.getText().toString());
            int number2Get = Integer.parseInt(number2.getText().toString());

            int collection  = numberGet * number2Get;

            solution.setText("Sonuç: " + collection);

        }
    }

    public void divide(View view){
        if(number.getText().toString().matches("") || number2.getText().toString().matches("")) {
            solution.setText("Lütfen sayı giriniz !");
        }else{

            int numberGet  = Integer.parseInt(number.getText().toString());
            int number2Get = Integer.parseInt(number2.getText().toString());

            int collection  = numberGet / number2Get;

            solution.setText("Sonuç: " + collection);

        }
    }

    public void clear(View view){

        solution.setText("0");
        number.setText("");
        number2.setText("");
    }

    public void back(View view){
        Intent back = new Intent(BesiktasAccounts.this, Besiktas.class);
        startActivity(back);

    }

}