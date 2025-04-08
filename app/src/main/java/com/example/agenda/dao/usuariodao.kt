package com.example.agenda.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.agenda.model.Usuarios

@Dao

interface usuariodao {
    @Insert
    fun inserir(listaUsuario: MutableList<Usuarios>)
}