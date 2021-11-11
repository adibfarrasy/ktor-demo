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
enum class TablesTableType(@get:JvmName("literal") public val literal: String) : EnumType {
    `BASE TABLE`("BASE TABLE"),
    VIEW("VIEW"),
    `SYSTEM VIEW`("SYSTEM VIEW");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "TABLES_TABLE_TYPE"
    override fun getLiteral(): String = literal
}
