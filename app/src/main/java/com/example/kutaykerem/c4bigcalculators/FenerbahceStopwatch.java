package com.example.kutaykerem.c4bigcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FenerbahceStopwatch extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    TextView followed;
    int number = 0;
    Button start;
    Button stop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenerbahce_stopwatch);

        handler = new Handler();
        followed = findViewById(R.id.followed);
        start = (Button) findViewById(R.id.basla);
        stop = (Button) findViewById(R.id.stop);





    }


    public void start(View view){

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                followed.setText("" + number);
                number = number +1;
                followed.setText(""+ number);
                handler.postDelayed(runnable,1000);

                start.setEnabled(false);

            }
        };
        handler.post(runnable);




    }

    public void clear(View view){
        number = 0;
        followed.setText(""+ number);
        start.setEnabled(true);
        handler.removeCallbacks(runnable);

    }


    public void stop(View view){

        handler.removeCallbacks(runnable);
        start.setEnabled(true);


    }


    public void back(View view){
        Intent intent = new Intent(FenerbahceStopwatch.this,Fenerbahce.class);
        startActivity(intent);


    }

}