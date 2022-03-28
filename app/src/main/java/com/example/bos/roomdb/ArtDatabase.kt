package com.example.bos.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bos.model.Art

@Database(entities = [Art::class], version = 1)
abstract class ArtDatabase : RoomDatabase() {
    abstract fun artDao(): ArtDao
}