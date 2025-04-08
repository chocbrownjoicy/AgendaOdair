package com.example.agenda.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Usuarios::class], version = 1 )
class AppDataBase {
abstract class AppDataBase:RoomDatabase(){
    abstract fun usuarios():Usuarios
}

}