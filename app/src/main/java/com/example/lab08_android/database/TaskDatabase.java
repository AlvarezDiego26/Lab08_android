package com.example.lab08_android.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lab08_android.model.Task
import com.example.lab08_android.database.TaskDao

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
