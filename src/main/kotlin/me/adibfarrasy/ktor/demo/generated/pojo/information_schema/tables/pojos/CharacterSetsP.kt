/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable

import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class CharacterSetsP(
    var characterSetName: String? = null,
    var defaultCollateName: String? = null,
    var description: String? = null,
    var maxlen: UInteger? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("CharacterSetsP (")

        sb.append(characterSetName)
        sb.append(", ").append(defaultCollateName)
        sb.append(", ").append(description)
        sb.append(", ").append(maxlen)

        sb.append(")")
        return sb.toString()
    }
}
