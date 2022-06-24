package com.didemkaraca.ecommerce.api

import retrofit2.http.GET

//https://canerture.com/api/ecommerce/get_products.php

private val BASE_URL="https://canerture.com/api/ecommerce/get_products.php"

interface ApiService {
    @GET(" get_products.php")
            suspend fun getProducts(): List<Product>
}