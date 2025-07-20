package com.example.myassssessmentapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("getDashboard") // 🔁 Replace this with your real endpoint
    fun getDashboard(
        @Query("keypass") keypass: String
    ): Call<DashboardResponse>
}
