/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.TableConstraintsExtensionsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.JSON
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row6
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
open class TableConstraintsExtensions(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TableConstraintsExtensionsRecord>?,
    aliased: Table<TableConstraintsExtensionsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TableConstraintsExtensionsRecord>(
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
         * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code>
         */
        val TABLE_CONSTRAINTS_EXTENSIONS: TableConstraintsExtensions = TableConstraintsExtensions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TableConstraintsExtensionsRecord> = TableConstraintsExtensionsRecord::class.java

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG</code>.
     */
    val CONSTRAINT_CATALOG: TableField<TableConstraintsExtensionsRecord, String?> = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<TableConstraintsExtensionsRecord, String?> = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME</code>.
     */
    val CONSTRAINT_NAME: TableField<TableConstraintsExtensionsRecord, String?> = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<TableConstraintsExtensionsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    val ENGINE_ATTRIBUTE: TableField<TableConstraintsExtensionsRecord, JSON?> = createField(DSL.name("ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "")

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    val SECONDARY_ENGINE_ATTRIBUTE: TableField<TableConstraintsExtensionsRecord, JSON?> = createField(DSL.name("SECONDARY_ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "")

    private constructor(alias: Name, aliased: Table<TableConstraintsExtensionsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TableConstraintsExtensionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code>
     * table reference
     */
    constructor(): this(DSL.name("TABLE_CONSTRAINTS_EXTENSIONS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TableConstraintsExtensionsRecord>): this(Internal.createPathAlias(child, key), child, key, TABLE_CONSTRAINTS_EXTENSIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): TableConstraintsExtensions = TableConstraintsExtensions(DSL.name(alias), this)
    override fun `as`(alias: Name): TableConstraintsExtensions = TableConstraintsExtensions(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TableConstraintsExtensions = TableConstraintsExtensions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TableConstraintsExtensions = TableConstraintsExtensions(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, String?, String?, JSON?, JSON?> = super.fieldsRow() as Row6<String?, String?, String?, String?, JSON?, JSON?>
}