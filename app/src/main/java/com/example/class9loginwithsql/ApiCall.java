package com.example.class9loginwithsql;

import com.example.class9loginwithsql.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCall {

    public static String BASE_URL = "https://10.0.2.2/student/";

    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if (retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }


        return retrofit;
    }

}
