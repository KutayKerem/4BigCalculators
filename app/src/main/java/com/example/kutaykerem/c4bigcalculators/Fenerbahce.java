package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kutaykerem.c4bigcalculators.Model.Time;
import com.example.kutaykerem.c4bigcalculators.Service.API;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Fenerbahce extends AppCompatActivity {
    public String Base_Url = "http://worldtimeapi.org/api/timezone/";
    public API timeApı;
    public Call<Time> timeAll;
    public Time endTime;

    Retrofit retrofit;
    TextView timetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenerbahce);

        timetext = findViewById(R.id.textView4);




        retrofit = new Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create()).build();

        timeApı = retrofit.create(API.class);

        timeAll = timeApı.getData();

        timeAll.enqueue(new Callback<Time>() {
            @Override
            public void onResponse(Call<Time> call, Response<Time> response) {
                if(response.isSuccessful()){
                    endTime = response.body();

                    timetext.setText(""+ endTime.datetime.split("T")[0]);


                }


            }

            @Override
            public void onFailure(Call<Time> call, Throwable t) {
                Toast.makeText(Fenerbahce.this,t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                System.out.println("Error:"+t.getLocalizedMessage());
            }
        });

    }

    public void accountfb(View view){
        Intent intent = new Intent(Fenerbahce.this,FenerbahceAccounts.class);
        startActivity(intent);


    }

    public void counterfb(View view){
        Intent intent = new Intent(Fenerbahce.this,FenerbahceCounter.class);
        startActivity(intent);

    }


    public void stopwatch(View view){
        Intent intent = new Intent(Fenerbahce.this,FenerbahceStopwatch.class);
        startActivity(intent);

    }

    public void back(View view){
        Intent intent = new Intent(Fenerbahce.this,questionScreen.class);
        startActivity(intent);


    }





}