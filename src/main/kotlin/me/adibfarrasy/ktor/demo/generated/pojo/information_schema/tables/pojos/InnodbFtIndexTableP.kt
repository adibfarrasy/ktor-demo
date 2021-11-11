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
data class InnodbFtIndexTableP(
    var word: String? = null,
    var firstDocId: ULong? = null,
    var lastDocId: ULong? = null,
    var docCount: ULong? = null,
    var docId: ULong? = null,
    var position: ULong? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbFtIndexTableP (")

        sb.append(word)
        sb.append(", ").append(firstDocId)
        sb.append(", ").append(lastDocId)
        sb.append(", ").append(docCount)
        sb.append(", ").append(docId)
        sb.append(", ").append(position)

        sb.append(")")
        return sb.toString()
    }
}
