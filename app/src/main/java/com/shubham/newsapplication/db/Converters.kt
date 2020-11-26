package com.shubham.newsapplication.db

import androidx.room.TypeConverter
import com.shubham.newsapplication.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}