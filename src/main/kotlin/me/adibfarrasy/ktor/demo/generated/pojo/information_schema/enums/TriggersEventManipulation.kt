/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.information_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class TriggersEventManipulation(@get:JvmName("literal") public val literal: String) : EnumType {
    INSERT("INSERT"),
    UPDATE("UPDATE"),
    DELETE("DELETE");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "TRIGGERS_EVENT_MANIPULATION"
    override fun getLiteral(): String = literal
}