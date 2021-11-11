/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class OptimizerTraceP(
    var query: String? = null,
    var trace: String? = null,
    var missingBytesBeyondMaxMemSize: Int? = null,
    var insufficientPrivileges: Byte? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("OptimizerTraceP (")

        sb.append(query)
        sb.append(", ").append(trace)
        sb.append(", ").append(missingBytesBeyondMaxMemSize)
        sb.append(", ").append(insufficientPrivileges)

        sb.append(")")
        return sb.toString()
    }
}