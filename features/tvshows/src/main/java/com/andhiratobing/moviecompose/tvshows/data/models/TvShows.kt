package com.andhiratobing.moviecompose.tvshows.data.models

import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain
import com.google.gson.annotations.SerializedName

/**
 * Object Movie
 */
data class TvShows(
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
    @SerializedName("vote_count") val voteCount: Int?,
)

/**
 * Mapper tv shows to tv shows domain
 */
fun TvShows.asDomain(): TvShowsDomain {
    return TvShowsDomain(
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
 * Mapper tv shows  list to movie tv shows  list
 */
fun List<TvShows>.asDomains(): List<TvShowsDomain> {
    return this.map {
        it.asDomain()
    }
}