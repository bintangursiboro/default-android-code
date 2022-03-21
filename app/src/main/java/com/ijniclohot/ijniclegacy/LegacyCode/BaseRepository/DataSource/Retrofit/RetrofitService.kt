package com.ijniclohot.ijniclegacy.LegacyCode.BaseRepository.DataSource.Retrofit

import android.util.Log
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService{

    companion object{
        var BASE_URL = "SET UR BASE URL HERE"

        var gson = GsonBuilder().setLenient().create()
        fun create(): ApiInterface{
            Log.e("Retrofit", "Create Retrofit Instance")
            val retrofit = Retrofit.Builder().addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(ApiInterface::class.java)
        }
    }
}