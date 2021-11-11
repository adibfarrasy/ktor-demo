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
data class InnodbTablestatsP(
    var tableId: ULong? = null,
    var name: String? = null,
    var statsInitialized: String? = null,
    var numRows: ULong? = null,
    var clustIndexSize: ULong? = null,
    var otherIndexSize: ULong? = null,
    var modifiedCounter: ULong? = null,
    var autoinc: ULong? = null,
    var refCount: Int? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbTablestatsP (")

        sb.append(tableId)
        sb.append(", ").append(name)
        sb.append(", ").append(statsInitialized)
        sb.append(", ").append(numRows)
        sb.append(", ").append(clustIndexSize)
        sb.append(", ").append(otherIndexSize)
        sb.append(", ").append(modifiedCounter)
        sb.append(", ").append(autoinc)
        sb.append(", ").append(refCount)

        sb.append(")")
        return sb.toString()
    }
}