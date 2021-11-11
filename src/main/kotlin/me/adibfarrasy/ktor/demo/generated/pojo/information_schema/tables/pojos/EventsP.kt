/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime

import me.adibfarrasy.ktor.demo.generated.pojo.information_schema.enums.EventsIntervalField
import me.adibfarrasy.ktor.demo.generated.pojo.information_schema.enums.EventsStatus

import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class EventsP(
    var eventCatalog: String? = null,
    var eventSchema: String? = null,
    var eventName: String? = null,
    var definer: String? = null,
    var timeZone: String? = null,
    var eventBody: String? = null,
    var eventDefinition: String? = null,
    var eventType: String? = null,
    var executeAt: LocalDateTime? = null,
    var intervalValue: String? = null,
    var intervalField: EventsIntervalField? = null,
    var sqlMode: String? = null,
    var starts: LocalDateTime? = null,
    var ends: LocalDateTime? = null,
    var status: EventsStatus? = null,
    var onCompletion: String? = null,
    var created: LocalDateTime? = null,
    var lastAltered: LocalDateTime? = null,
    var lastExecuted: LocalDateTime? = null,
    var eventComment: String? = null,
    var originator: UInteger? = null,
    var characterSetClient: String? = null,
    var collationConnection: String? = null,
    var databaseCollation: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("EventsP (")

        sb.append(eventCatalog)
        sb.append(", ").append(eventSchema)
        sb.append(", ").append(eventName)
        sb.append(", ").append(definer)
        sb.append(", ").append(timeZone)
        sb.append(", ").append(eventBody)
        sb.append(", ").append(eventDefinition)
        sb.append(", ").append(eventType)
        sb.append(", ").append(executeAt)
        sb.append(", ").append(intervalValue)
        sb.append(", ").append(intervalField)
        sb.append(", ").append(sqlMode)
        sb.append(", ").append(starts)
        sb.append(", ").append(ends)
        sb.append(", ").append(status)
        sb.append(", ").append(onCompletion)
        sb.append(", ").append(created)
        sb.append(", ").append(lastAltered)
        sb.append(", ").append(lastExecuted)
        sb.append(", ").append(eventComment)
        sb.append(", ").append(originator)
        sb.append(", ").append(characterSetClient)
        sb.append(", ").append(collationConnection)
        sb.append(", ").append(databaseCollation)

        sb.append(")")
        return sb.toString()
    }
}
