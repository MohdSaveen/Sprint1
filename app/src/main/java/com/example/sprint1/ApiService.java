package com.example.sprint1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movies_db")
    Call<List<ResponseDTO>> getData();
}
