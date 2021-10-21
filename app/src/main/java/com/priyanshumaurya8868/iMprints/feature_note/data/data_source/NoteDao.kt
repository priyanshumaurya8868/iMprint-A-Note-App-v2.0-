package com.priyanshumaurya8868.iMprints.feature_note.data.data_source

import androidx.room.*
import com.priyanshumaurya8868.iMprints.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * from note")
    fun getNotes() : Flow<List<Note>>

    @Query("SELECT * from note WHERE id = :id")
    suspend fun getNoteById(id:Int):Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note:Note)

    @Delete
    suspend fun deleteNote(note:Note)

}