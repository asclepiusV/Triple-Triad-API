package com.example.utspemrogramanmobile

import com.squareup.moshi.Json

data class TripleTriadData (
    @Json(name="name")
    val name: String,
    @Json(name="image")
    val image: String,
    @Json(name="description")
    val description: String
)

data class DataApiResponse(
    @Json(name="results")
    val result : List<TripleTriadData>
)