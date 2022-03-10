package com.mahan.compose.jettrivia.data

import android.util.Log
import com.mahan.compose.jettrivia.model.QuestionItem
import com.mahan.compose.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private var data = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            // data.loading = true
            data.data = api.getAllQuestions()
            // if (data.data.toString().isNotEmpty()) data.loading = false
        } catch ( e: Exception) {
            data.exception = e
            Log.d("Exc", "getAllQuestions: ${data.exception!!.localizedMessage}")
        }

        return data
    }
}