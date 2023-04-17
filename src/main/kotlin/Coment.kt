package ru.netology

data class Comment(
    val id: Int,
    val text: String,
    val fromId: Int,
    val date: Int,//
    val donut: Donut? = null,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Array<Attachment>? = null,
    val thread: Thread? = null
)