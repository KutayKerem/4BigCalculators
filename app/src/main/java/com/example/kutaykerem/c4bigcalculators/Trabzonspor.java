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

public class Trabzonspor extends AppCompatActivity {


   public String Base_Url = "http://worldtimeapi.org/api/timezone/";
   public API timeApı;
   public Call<Time> timeAll;
   public Time endTime;

   Retrofit retrofit;
   TextView timetext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabzonspor);

        timetext = findViewById(R.id.texttime);






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
             Toast.makeText(Trabzonspor.this,t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
             System.out.println("Error:" + t.getLocalizedMessage());

         }
     });

    }




    public void accountts(View view){
        Intent intent = new Intent(Trabzonspor.this, TrabzonsporAccounts.class);
        startActivity(intent);
    }

    public void counterts(View view){
        Intent intent = new Intent(Trabzonspor.this,TrabzonsporCounter.class);
        startActivity(intent);
    }


    public void stopwatch(View view){
        Intent intent = new Intent(Trabzonspor.this,TrabzonsporStopwatch.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(Trabzonspor.this,questionScreen.class);
        startActivity(intent);

    }




}