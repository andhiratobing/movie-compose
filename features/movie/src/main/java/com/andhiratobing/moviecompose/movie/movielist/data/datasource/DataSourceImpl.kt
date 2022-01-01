package com.andhiratobing.moviecompose.movie.movielist.data.datasource

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import java.nio.charset.Charset
import javax.inject.Inject


class DataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : DataSource {

    /**
     * Get movie from file movie.json in directory assets
     */
    override fun getMovieList(): String {
        val json: String?
        val charset: Charset = Charsets.UTF_8
        try {
            val jsonFile = context.assets.open("movie.json")
            val size = jsonFile.available()
            val buffer = ByteArray(size)
            jsonFile.read(buffer)
            jsonFile.close()
            json = String(buffer, charset)
        } catch (e: Throwable) {
            e.message
            return e.localizedMessage ?: ""
        }
        return json
    }

}