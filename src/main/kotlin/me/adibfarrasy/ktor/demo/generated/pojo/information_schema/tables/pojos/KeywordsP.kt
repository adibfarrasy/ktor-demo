/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class KeywordsP(
    var word: String? = null,
    var reserved: Int? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("KeywordsP (")

        sb.append(word)
        sb.append(", ").append(reserved)

        sb.append(")")
        return sb.toString()
    }
}