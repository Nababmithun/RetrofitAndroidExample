package com.androidlime.retrofitandroidexample;

import com.androidlime.retrofitandroidexample.pojo.MultipleResource;
import com.androidlime.retrofitandroidexample.pojo.User;
import com.androidlime.retrofitandroidexample.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Mithun on 10/1/2019.
 */

public interface APIInterface  {



    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}