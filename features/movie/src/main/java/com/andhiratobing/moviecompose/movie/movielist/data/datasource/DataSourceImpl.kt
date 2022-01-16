package com.andhiratobing.moviecompose.movie.movielist.data.datasource

import android.content.Context
import com.andhiratobing.abstraction.utils.Utils
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class DataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : DataSource {

    /**
     * Get movie from file movie.json in directory assets
     */
    override fun getMovieList(): String {
        return Utils.openFileJson("movie.json", context)
    }

}