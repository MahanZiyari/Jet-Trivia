package com.mahan.compose.jettrivia.network

import com.mahan.compose.jettrivia.model.QuestionItem
import retrofit2.http.GET

interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): ArrayList<QuestionItem>
}