package com.andhiratobing.components.movie

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.sp

@Composable
fun MovieTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .layoutId("title_constrain")
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
