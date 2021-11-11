/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable

import me.adibfarrasy.ktor.demo.generated.pojo.information_schema.enums.ViewsCheckOption
import me.adibfarrasy.ktor.demo.generated.pojo.information_schema.enums.ViewsIsUpdatable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class ViewsP(
    var tableCatalog: String? = null,
    var tableSchema: String? = null,
    var tableName: String? = null,
    var viewDefinition: String? = null,
    var checkOption: ViewsCheckOption? = null,
    @set:JvmName("setIsUpdatable")
    var isUpdatable: ViewsIsUpdatable? = null,
    var definer: String? = null,
    var securityType: String? = null,
    var characterSetClient: String? = null,
    var collationConnection: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("ViewsP (")

        sb.append(tableCatalog)
        sb.append(", ").append(tableSchema)
        sb.append(", ").append(tableName)
        sb.append(", ").append(viewDefinition)
        sb.append(", ").append(checkOption)
        sb.append(", ").append(isUpdatable)
        sb.append(", ").append(definer)
        sb.append(", ").append(securityType)
        sb.append(", ").append(characterSetClient)
        sb.append(", ").append(collationConnection)

        sb.append(")")
        return sb.toString()
    }
}