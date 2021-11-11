/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class RoleColumnGrantsP(
    var grantor: String? = null,
    var grantorHost: String? = null,
    var grantee: String? = null,
    var granteeHost: String? = null,
    var tableCatalog: String? = null,
    var tableSchema: String? = null,
    var tableName: String? = null,
    var columnName: String? = null,
    var privilegeType: String? = null,
    @set:JvmName("setIsGrantable")
    var isGrantable: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("RoleColumnGrantsP (")

        sb.append(grantor)
        sb.append(", ").append(grantorHost)
        sb.append(", ").append(grantee)
        sb.append(", ").append(granteeHost)
        sb.append(", ").append(tableCatalog)
        sb.append(", ").append(tableSchema)
        sb.append(", ").append(tableName)
        sb.append(", ").append(columnName)
        sb.append(", ").append(privilegeType)
        sb.append(", ").append(isGrantable)

        sb.append(")")
        return sb.toString()
    }
}
