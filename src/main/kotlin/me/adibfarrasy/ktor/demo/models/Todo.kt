package me.adibfarrasy.ktor.demo.models

import kotlinx.serialization.Serializable

@Serializable
data class Todo(val id: Int, val description: String, var status: String )

val todoStorage = mutableListOf<Todo>(
    Todo(1, "Learn Kotlin basics", "Done"),
    Todo(2, "Learn Ktor basics", "Done"),
    Todo(3, "Learn Jooq basics", "In Progress")
)