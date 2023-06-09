 package com.example.utspemrogramanmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import retrofit2.Call
import retrofit2.Response


 class MainActivity : AppCompatActivity(){
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         val client = ApiClient.apiService.fetchTripleTriad()

         client.enqueue(object : retrofit2.Callback<DataApiResponse> {

             override fun onResponse(
                 call: Call<DataApiResponse>,
                 response: Response<DataApiResponse>
             ) {
                 if (response.isSuccessful) {
                     Log.d("triple triad", "" + response.body())

                     val result = response.body()?.result
                     result?.let {

                         val adapter = MainAdapter(result)

                         val recyclerView = findViewById<RecyclerView>(R.id.recylerView)

                         recyclerView?.layoutManager =
                             StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
                         recyclerView?.adapter = adapter
                     }
                 }
             }
             override fun onFailure(call: Call<DataApiResponse>, t: Throwable) {
                 Log.e("failed", "" + t.message)
             }
         })
     }
 }
