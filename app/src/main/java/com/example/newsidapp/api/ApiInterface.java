package com.example.newsidapp.api;

import com.example.newsidapp.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(

        @Query("q") String keyword,
        @Query("country") String country,
        @Query("sortBy") String sortBy,
        @Query("apiKey") String apiKey

    );

}
