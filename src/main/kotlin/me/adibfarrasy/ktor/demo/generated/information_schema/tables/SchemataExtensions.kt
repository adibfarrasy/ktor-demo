/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.SchemataExtensionsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SchemataExtensions(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SchemataExtensionsRecord>?,
    aliased: Table<SchemataExtensionsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SchemataExtensionsRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.SCHEMATA_EXTENSIONS</code>
         */
        val SCHEMATA_EXTENSIONS: SchemataExtensions = SchemataExtensions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchemataExtensionsRecord> = SchemataExtensionsRecord::class.java

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    val CATALOG_NAME: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    val SCHEMA_NAME: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    val OPTIONS: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("OPTIONS"), SQLDataType.VARCHAR(256), this, "")

    private constructor(alias: Name, aliased: Table<SchemataExtensionsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SchemataExtensionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.SCHEMATA_EXTENSIONS</code> table
     * reference
     */
    constructor(): this(DSL.name("SCHEMATA_EXTENSIONS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SchemataExtensionsRecord>): this(Internal.createPathAlias(child, key), child, key, SCHEMATA_EXTENSIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): SchemataExtensions = SchemataExtensions(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemataExtensions = SchemataExtensions(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemataExtensions = SchemataExtensions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemataExtensions = SchemataExtensions(name, null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<String?, String?, String?> = super.fieldsRow() as Row3<String?, String?, String?>
}
