package com.priyanshumaurya8868.iMprints.feature_note.domain.use_cases

import com.priyanshumaurya8868.iMprints.feature_note.domain.model.InvalidNoteException
import com.priyanshumaurya8868.iMprints.feature_note.domain.model.Note
import com.priyanshumaurya8868.iMprints.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repo: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank())
            throw InvalidNoteException("The title can't be empty.")

        if (note.content.isBlank())
            throw InvalidNoteException("The content cant be empty.")

        repo.insertNote(note)
    }
}