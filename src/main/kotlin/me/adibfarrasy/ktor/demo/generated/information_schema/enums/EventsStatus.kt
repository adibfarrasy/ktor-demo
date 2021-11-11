/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class EventsStatus(@get:JvmName("literal") public val literal: String) : EnumType {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    SLAVESIDE_DISABLED("SLAVESIDE_DISABLED");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "EVENTS_STATUS"
    override fun getLiteral(): String = literal
}