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
enum class RoutinesSecurityType(@get:JvmName("literal") public val literal: String) : EnumType {
    DEFAULT("DEFAULT"),
    INVOKER("INVOKER"),
    DEFINER("DEFINER");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "ROUTINES_SECURITY_TYPE"
    override fun getLiteral(): String = literal
}
