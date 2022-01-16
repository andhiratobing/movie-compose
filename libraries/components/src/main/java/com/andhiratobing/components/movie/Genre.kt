package com.andhiratobing.components.movie

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Genre(
    genre: List<String>,
    modifier: Modifier = Modifier
) {
    LazyRow {
        items(genre.size) { genreName ->
            Card(
                backgroundColor = Color.LightGray,
                modifier = modifier
                    .clip(RoundedCornerShape(12.dp))
            ) {
                Text(
                    text = genre[genreName],
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = modifier
                        .padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 2.dp,
                            bottom = 2.dp
                        )
                )
            }
        }
    }
}