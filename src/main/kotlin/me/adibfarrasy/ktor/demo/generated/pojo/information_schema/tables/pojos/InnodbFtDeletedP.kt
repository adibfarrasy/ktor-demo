/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable

import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class InnodbFtDeletedP(
    var docId: ULong? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbFtDeletedP (")

        sb.append(docId)

        sb.append(")")
        return sb.toString()
    }
}