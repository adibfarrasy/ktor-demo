/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.todo_db.tables.pojos


import java.io.Serializable

/**
 * This class is generated by jOOQ.
 */

@Suppress("UNCHECKED_CAST")

data class TodoListP(
    var id: Int? = null,
    var description: String? = null,
    var status: String? = null
) : Serializable {
    override fun toString(): String {
        val sb = StringBuilder("{ ")

        sb.append("id: ").append(id).append(", ")
        sb.append("description: ").append(description).append(", ")
        sb.append("status: ").append(status)

        sb.append(" }")
        return sb.toString()
    }
}
