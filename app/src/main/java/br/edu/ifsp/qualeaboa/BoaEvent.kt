package br.edu.ifsp.qualeaboa

import java.util.UUID

data class BoaEvent(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    val location: String,
    val creator: String,
    val interested: Set<String> = emptySet()
)
