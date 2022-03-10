package com.mahan.compose.jettrivia.ui.components

import android.util.Log
import androidx.compose.runtime.Composable
import com.mahan.compose.jettrivia.ui.screens.QuestionViewModel

@Composable
fun Questions(viewModel: QuestionViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    // Log.d("Size", "Questions: ${questions?.size}")
    if (viewModel.data.value.loading == true) {
        Log.d("API", "Questions: Loading...")
    } else {
        Log.d("API", "Questions: Loading is done")
        Log.d("API", "Questions: ${questions?.size}")
    }

}