package com.andhiratobing.moviecompose.movie.movielist.data.models

import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain
import com.google.gson.annotations.SerializedName

/**
 * Object movie
 */
data class Movie(
    val adult: Boolean?,
    @SerializedName("backdrop_path") val backdropPath: String?,
    @SerializedName("genre_ids") val genreIds: List<String>?,
    val id: Int,
    @SerializedName("original_language") val originalLanguage: String?,
    @SerializedName("original_title") val originalTitle: String?,
    val overview: String?,
    val popularity: Double?,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("release_date") val releaseDate: String?,
    val title: String?,
    val video: Boolean?,
    @SerializedName("vote_average") val voteAverage: Double?,
    @SerializedName("vote_count") val voteCount: Int?
)

/**
 * Mapper movie to movie domain
 */
fun Movie.asDomain(): MovieDomain {
    return MovieDomain(
        adult = this.adult,
        backdropPath = this.backdropPath,
        genreIds = this.genreIds,
        id = this.id,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        popularity = this.popularity,
        posterPath = this.posterPath,
        releaseDate = this.releaseDate,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount

    )
}

/**
 * Mapper movie list to movie domain list
 */
fun List<Movie>.asDomains(): List<MovieDomain> {
    return this.map {
        it.asDomain()
    }
}