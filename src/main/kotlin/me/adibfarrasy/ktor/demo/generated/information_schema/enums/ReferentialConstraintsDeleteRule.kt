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
enum class ReferentialConstraintsDeleteRule(@get:JvmName("literal") public val literal: String) : EnumType {
    `NO ACTION`("NO ACTION"),
    RESTRICT("RESTRICT"),
    CASCADE("CASCADE"),
    `SET NULL`("SET NULL"),
    `SET DEFAULT`("SET DEFAULT");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "REFERENTIAL_CONSTRAINTS_DELETE_RULE"
    override fun getLiteral(): String = literal
}
