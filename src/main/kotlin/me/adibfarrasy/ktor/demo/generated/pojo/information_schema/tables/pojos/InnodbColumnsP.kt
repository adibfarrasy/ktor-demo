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
data class InnodbColumnsP(
    var tableId: ULong? = null,
    var name: String? = null,
    var pos: ULong? = null,
    var mtype: Int? = null,
    var prtype: Int? = null,
    var len: Int? = null,
    var hasDefault: Int? = null,
    var defaultValue: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbColumnsP (")

        sb.append(tableId)
        sb.append(", ").append(name)
        sb.append(", ").append(pos)
        sb.append(", ").append(mtype)
        sb.append(", ").append(prtype)
        sb.append(", ").append(len)
        sb.append(", ").append(hasDefault)
        sb.append(", ").append(defaultValue)

        sb.append(")")
        return sb.toString()
    }
}
