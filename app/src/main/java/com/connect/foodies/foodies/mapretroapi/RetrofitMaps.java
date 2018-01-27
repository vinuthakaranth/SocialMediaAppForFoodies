package com.connect.foodies.foodies.mapretroapi;

import com.connect.foodies.foodies.mapretroapi.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by vinut on 11/27/2017.
 */

public interface RetrofitMaps {


    /*
 * Retrofit get annotation with our URL
 * And our method that will return us details of student.
 */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyBh9yUPu1Wsg4Mc0mwQroY96h6NdSnmRB8")
    Call<Example> getNearbyPlaces(@Query("type") String type,
                                  @Query("location") String location,
                                  @Query("radius") int radius);

}
