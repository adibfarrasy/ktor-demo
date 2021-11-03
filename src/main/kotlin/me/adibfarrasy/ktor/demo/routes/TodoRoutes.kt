package me.adibfarrasy.ktor.demo.routes

import me.adibfarrasy.ktor.demo.models.*
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*

fun Route.todoRouting() {
    route("/todo") {
        get {
            if (todoStorage.isNotEmpty()) {
                call.respond(todoStorage)
            } else {
                call.respondText("No todos found", status = HttpStatusCode.NotFound)
            }
//            call.respondText("Todo route!", status = HttpStatusCode.Accepted)
        }
        get("{id}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing or malformed id",
                status = HttpStatusCode.BadRequest
            )
            val todo =
                todoStorage.find { it.id == id.toInt() } ?: return@get call.respondText(
                    "No todo with id $id",
                    status = HttpStatusCode.NotFound
                )
            call.respond(todo)
        }
        post {
            val newTodo = call.receive<Todo>()
            todoStorage.add(newTodo)
            call.respondText("New todo added", status = HttpStatusCode.Created)
        }
        put("{id}"){
            val id = call.parameters["id"] ?: return@put call.respondText(
                "Missing or malformed id",
                status = HttpStatusCode.BadRequest
            )
            val oldTodo = todoStorage.find { it.id == id.toInt() } ?: return@put call.respondText(
                "No todo with id $id",
                status = HttpStatusCode.NotFound
            )
            val newTodo = call.receive<Todo>()
            todoStorage[todoStorage.indexOf(oldTodo)] = newTodo
            call.respondText("Todo edited", status = HttpStatusCode.Created)
        }
        delete("{id}") {
            val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
            if (todoStorage.removeIf { it.id == id.toInt() }) {
                call.respondText("Todo removed", status = HttpStatusCode.Accepted)
            } else {
                call.respondText("Not Found", status = HttpStatusCode.NotFound)
            }
        }
    }
}