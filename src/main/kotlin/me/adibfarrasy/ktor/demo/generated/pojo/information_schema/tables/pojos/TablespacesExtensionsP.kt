/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable

import org.jooq.JSON


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class TablespacesExtensionsP(
    var tablespaceName: String? = null,
    var engineAttribute: JSON? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("TablespacesExtensionsP (")

        sb.append(tablespaceName)
        sb.append(", ").append(engineAttribute)

        sb.append(")")
        return sb.toString()
    }
}
