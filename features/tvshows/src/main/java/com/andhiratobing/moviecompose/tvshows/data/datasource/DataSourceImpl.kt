package com.andhiratobing.moviecompose.tvshows.data.datasource

import android.content.Context
import com.andhiratobing.abstraction.utils.Utils
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    @ApplicationContext val context: Context,
) : DataSource {

    /**
     * Get movie from file tvshows.json in directory assets
     */
    override fun getTvShowsList(): String {
        return Utils.openFileJson("tvshows.json", context)
    }
}