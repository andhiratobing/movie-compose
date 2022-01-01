package com.andhiratobing.moviecompose.movie.movielist.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import coil.annotation.ExperimentalCoilApi
import com.andhiratobing.components.movie.MovieGenre
import com.andhiratobing.components.movie.MoviePosterPath
import com.andhiratobing.components.movie.MovieTitle
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment
import com.google.accompanist.flowlayout.FlowMainAxisAlignment
import com.google.accompanist.flowlayout.FlowRow


@ExperimentalCoilApi
@Composable
fun MovieListScreen(
    title: String,
    posterPath: String,
    genre: List<String>
) {

    val constrainSet = ConstraintSet {
        val posterPathConstrain = createRefFor("poster_path_constrain")
        val titleConstrain = createRefFor("title_constrain")
        val genreConstrain = createRefFor("genre_constrain")
        constrain(posterPathConstrain) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }
        constrain(titleConstrain) {
            start.linkTo(posterPathConstrain.end, 16.dp)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
        }
        constrain(genreConstrain) {
            start.linkTo(titleConstrain.start)
            end.linkTo(parent.end, 16.dp)
            top.linkTo(titleConstrain.bottom, 8.dp)
            width = Dimension.fillToConstraints
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(20.dp))
            .padding(
                start = 8.dp,
                end = 8.dp,
                top = 16.dp,
                bottom = 8.dp
            )
    ) {
        ConstraintLayout(
            constrainSet,
            modifier = Modifier.fillMaxSize()
        ) {
            //movie poster
            MoviePosterPath(
                posterPath = posterPath,
                modifier = Modifier
                    .width(120.dp)
                    .height(150.dp)
            )

            //movie title
            MovieTitle(
                title = title,
                modifier = Modifier
                    .padding(top = 6.dp)
                    .fillMaxWidth()
            )

            //movie genre
            FlowRow(
                modifier = Modifier
                    .layoutId("genre_constrain"),
                //vertical alignment
                crossAxisAlignment = FlowCrossAxisAlignment.Start,
                //horizontal alignment
                mainAxisAlignment = FlowMainAxisAlignment.Start,
                //vertical spacing
                crossAxisSpacing = 8.dp,
                //horizontal spacing
                mainAxisSpacing = 8.dp

            ) {
                genre.forEach {
                    MovieGenre(genre = listOf(it))
                }
            }
        }
    }
}