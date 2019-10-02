package com.androidlime.retrofitandroidexample.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mithun on 10/1/2019.
 */

public class CreateUserResponse {


    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

}