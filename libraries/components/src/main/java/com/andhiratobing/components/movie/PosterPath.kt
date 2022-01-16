package com.andhiratobing.components.movie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import coil.transform.RoundedCornersTransformation


@ExperimentalCoilApi
@Composable
fun PosterPath(
    posterPath: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .layoutId("poster_path_constrain")
    ) {

        val painter = rememberImagePainter(data = posterPath,
            builder = {
                transformations(
                    RoundedCornersTransformation(
                        topLeft = 16f,
                        bottomLeft = 16f
                    )
                )
            })

        Image(
            painter = painter,
            contentDescription = "Poster path"
        )
    }
}
