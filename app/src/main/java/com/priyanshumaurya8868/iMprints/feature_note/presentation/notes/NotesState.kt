package com.priyanshumaurya8868.iMprints.feature_note.presentation.notes

import com.priyanshumaurya8868.iMprints.feature_note.domain.model.Note
import com.priyanshumaurya8868.iMprints.feature_note.domain.utils.NoteOrder
import com.priyanshumaurya8868.iMprints.feature_note.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
//for storage -> retain data