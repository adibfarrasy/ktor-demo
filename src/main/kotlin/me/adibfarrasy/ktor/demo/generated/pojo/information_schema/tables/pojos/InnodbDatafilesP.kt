/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class InnodbDatafilesP(
    var space: ByteArray? = null,
    var path: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("InnodbDatafilesP (")

        sb.append("[binary...]")
        sb.append(", ").append(path)

        sb.append(")")
        return sb.toString()
    }
}
