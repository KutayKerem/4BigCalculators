package com.example.kutaykerem.c4bigcalculators.Model;

import com.google.gson.annotations.SerializedName;

import java.util.concurrent.Executor;

public class Time {

     @SerializedName("datetime")
     public String datetime;

     public String getDatetime() {
          return datetime;
     }

     public void setDatetime(String datetime) {
          this.datetime = datetime;
     }
}