package com.example.class9loginwithsql;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("register.php")
    Call<Student> performRegistration(@Field("name") String Name,
                                      @Field("number") String Number,
                                      @Field("password") String Password);
}
