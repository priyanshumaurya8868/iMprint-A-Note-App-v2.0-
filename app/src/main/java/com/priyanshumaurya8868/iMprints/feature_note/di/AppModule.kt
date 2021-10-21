package com.priyanshumaurya8868.iMprints.feature_note.di

import android.app.Application
import androidx.room.Room
import com.priyanshumaurya8868.iMprints.feature_note.data.data_source.NoteDatabase
import com.priyanshumaurya8868.iMprints.feature_note.data.repository.NoteRepositoryImpl
import com.priyanshumaurya8868.iMprints.feature_note.domain.repository.NoteRepository
import com.priyanshumaurya8868.iMprints.feature_note.domain.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            addNote = AddNote(repository),
            deleteNote = DeleteNote(repository),
            getNote = GetNote(repository),
            getNotes = GetNotes(repository)
        )
    }
}