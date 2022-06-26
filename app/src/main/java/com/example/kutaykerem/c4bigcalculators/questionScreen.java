package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;

public class questionScreen extends AppCompatActivity implements Serializable {

    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);





     }


     public void trabzonspor(View view){

        Intent intent = new Intent(questionScreen.this,Trabzonspor.class);
        startActivity(intent);

        Vote votes = new Vote();
        votes.vote = 1;

   }

    public void besiktas(View view){

        Intent intent = new Intent(questionScreen.this,Besiktas.class);
        startActivity(intent);

        Vote votes = new Vote();
        votes.vote = 2;

     }

    public void galatasaray(View view){

        Intent intent = new Intent(questionScreen.this,Galatasaray.class);
        startActivity(intent);

        Vote votes = new Vote();
        votes.vote = 3;

     }

    public void fenerbahce(View view){

        Intent intent = new Intent(questionScreen.this,Fenerbahce.class);
        startActivity(intent);

        Vote votes = new Vote();
        votes.vote = 4;

     }






}