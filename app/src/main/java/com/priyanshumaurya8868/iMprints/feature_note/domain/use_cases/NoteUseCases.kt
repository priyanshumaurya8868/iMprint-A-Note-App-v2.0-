package com.priyanshumaurya8868.iMprints.feature_note.domain.use_cases

data class NoteUseCases (
    val addNote : AddNote,
    val getNote: GetNote,
    val getNotes: GetNotes,
    val deleteNote: DeleteNote
        )