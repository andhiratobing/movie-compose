package com.andhiratobing.moviecompose.movie.movielist.domain.models

data class MovieDomain(
    val adult: Boolean?,
    val backdropPath: String?,
    val genreIds: List<String>?,
    val id: Int,
    val originalLanguage: String?,
    val originalTitle: String?,
    val overview: String?,
    val popularity: Double?,
    val posterPath: String?,
    val releaseDate: String?,
    val title: String?,
    val video: Boolean?,
    val voteAverage: Double?,
    val voteCount: Int?
)
