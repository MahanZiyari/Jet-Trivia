package com.mahan.compose.jettrivia.ui.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.mahan.compose.jettrivia.ui.components.Questions

@Composable
fun Trivia(viewModel: QuestionViewModel = hiltViewModel()) {
    Questions(viewModel = viewModel)
}