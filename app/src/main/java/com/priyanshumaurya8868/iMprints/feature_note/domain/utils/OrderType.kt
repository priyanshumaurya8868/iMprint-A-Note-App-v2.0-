package com.priyanshumaurya8868.iMprints.feature_note.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
