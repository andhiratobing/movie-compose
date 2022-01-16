package com.andhiratobing.abstraction.utils

import android.content.Context
import java.nio.charset.Charset

object Utils {

    fun openFileJson(fileName: String, context: Context): String {
        val json: String?
        val charset: Charset = Charsets.UTF_8
        try {
            val jsonFile = context.assets.open(fileName)
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