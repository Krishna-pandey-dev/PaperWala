package com.krishna.paperwala.api;

import com.krishna.paperwala.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getnews(
            @Query("country") String country,
            @Query("apikey") String apikey
    );
}
