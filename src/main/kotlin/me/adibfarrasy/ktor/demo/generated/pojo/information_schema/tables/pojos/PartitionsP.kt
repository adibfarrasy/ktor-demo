/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime

import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class PartitionsP(
    var tableCatalog: String? = null,
    var tableSchema: String? = null,
    var tableName: String? = null,
    var partitionName: String? = null,
    var subpartitionName: String? = null,
    var partitionOrdinalPosition: UInteger? = null,
    var subpartitionOrdinalPosition: UInteger? = null,
    var partitionMethod: String? = null,
    var subpartitionMethod: String? = null,
    var partitionExpression: String? = null,
    var subpartitionExpression: String? = null,
    var partitionDescription: String? = null,
    var tableRows: ULong? = null,
    var avgRowLength: ULong? = null,
    var dataLength: ULong? = null,
    var maxDataLength: ULong? = null,
    var indexLength: ULong? = null,
    var dataFree: ULong? = null,
    var createTime: LocalDateTime? = null,
    var updateTime: LocalDateTime? = null,
    var checkTime: LocalDateTime? = null,
    var checksum: Long? = null,
    var partitionComment: String? = null,
    var nodegroup: String? = null,
    var tablespaceName: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("PartitionsP (")

        sb.append(tableCatalog)
        sb.append(", ").append(tableSchema)
        sb.append(", ").append(tableName)
        sb.append(", ").append(partitionName)
        sb.append(", ").append(subpartitionName)
        sb.append(", ").append(partitionOrdinalPosition)
        sb.append(", ").append(subpartitionOrdinalPosition)
        sb.append(", ").append(partitionMethod)
        sb.append(", ").append(subpartitionMethod)
        sb.append(", ").append(partitionExpression)
        sb.append(", ").append(subpartitionExpression)
        sb.append(", ").append(partitionDescription)
        sb.append(", ").append(tableRows)
        sb.append(", ").append(avgRowLength)
        sb.append(", ").append(dataLength)
        sb.append(", ").append(maxDataLength)
        sb.append(", ").append(indexLength)
        sb.append(", ").append(dataFree)
        sb.append(", ").append(createTime)
        sb.append(", ").append(updateTime)
        sb.append(", ").append(checkTime)
        sb.append(", ").append(checksum)
        sb.append(", ").append(partitionComment)
        sb.append(", ").append(nodegroup)
        sb.append(", ").append(tablespaceName)

        sb.append(")")
        return sb.toString()
    }
}