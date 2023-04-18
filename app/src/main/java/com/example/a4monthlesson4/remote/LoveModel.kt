package com.example.a4monthlesson4.remote

import com.google.gson.annotations.SerializedName

//    {
//        "fname": "Tilek",
//        "sname": "Alice",
//        "percentage": "75",
//        "result": "All the best!"
//    }

data class LoveModel (
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,
):java.io.Serializable