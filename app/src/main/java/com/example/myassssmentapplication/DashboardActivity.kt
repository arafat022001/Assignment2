package com.example.myassssessmentapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Import your app-specific classes
import com.example.myassssessmentapplication.Entity
import com.example.myassssessmentapplication.EntityAdapter
import com.example.myassssessmentapplication.DetailsActivity
import com.example.myassssessmentapplication.DashboardResponse
import com.example.myassssessmentapplication.RetrofitClient

class DashboardActivity : AppCompatActivity() {

    private lateinit var adapter: EntityAdapter
    private val entityList = mutableListOf<Entity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        adapter = EntityAdapter(entityList) { entity ->
            val intent = DetailsActivity.newIntent(this, entity)
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val keypass = intent.getStringExtra("KEYPASS") ?: ""
        fetchDashboardData(keypass)
    }

    private fun fetchDashboardData(keypass: String) {
        val api = RetrofitClient.apiService

        api.getDashboard(keypass).enqueue(object : Callback<DashboardResponse> {
            override fun onResponse(
                call: Call<DashboardResponse>,
                response: Response<DashboardResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.data?.let {
                        entityList.clear()
                        entityList.addAll(it)
                        adapter.notifyDataSetChanged()
                    }
                } else {
                    Toast.makeText(
                        this@DashboardActivity,
                        "Failed to load dashboard: ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<DashboardResponse>, t: Throwable) {
                Toast.makeText(
                    this@DashboardActivity,
                    "Network error: ${t.message}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}
