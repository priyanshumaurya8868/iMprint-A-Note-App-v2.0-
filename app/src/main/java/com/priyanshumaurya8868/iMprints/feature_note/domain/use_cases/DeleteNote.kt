package com.priyanshumaurya8868.iMprints.feature_note.domain.use_cases

import com.priyanshumaurya8868.iMprints.feature_note.domain.model.Note
import com.priyanshumaurya8868.iMprints.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class DeleteNote(
    private val  repo : NoteRepository
) {
    suspend operator fun invoke(note:Note)  =
       repo.deleteNote(note)

}