package com.andhiratobing.components.movie

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun Overview(
    overview: String
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = overview,
            fontSize = 16.sp,
            color = Color.Black
        )
    }

}