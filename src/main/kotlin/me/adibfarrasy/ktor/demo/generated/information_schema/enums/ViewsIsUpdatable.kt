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
enum class ViewsIsUpdatable(@get:JvmName("literal") public val literal: String) : EnumType {
    NO("NO"),
    YES("YES");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "VIEWS_IS_UPDATABLE"
    override fun getLiteral(): String = literal
}