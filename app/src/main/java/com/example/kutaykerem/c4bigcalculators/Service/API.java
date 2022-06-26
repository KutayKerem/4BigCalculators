package com.example.kutaykerem.c4bigcalculators.Service;

import com.example.kutaykerem.c4bigcalculators.Model.Time;


import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("Europe/Istanbul")
    Call<Time> getData();
}
