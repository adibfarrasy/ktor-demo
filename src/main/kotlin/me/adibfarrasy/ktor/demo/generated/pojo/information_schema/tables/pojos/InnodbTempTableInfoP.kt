/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable

import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class InnodbTempTableInfoP(
    var tableId: ULong? = null,
    var name: String? = null,
    var nCols: UInteger? = null,
    var space: UInteger? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbTempTableInfoP (")

        sb.append(tableId)
        sb.append(", ").append(name)
        sb.append(", ").append(nCols)
        sb.append(", ").append(space)

        sb.append(")")
        return sb.toString()
    }
}
