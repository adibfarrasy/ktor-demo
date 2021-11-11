/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.ViewTableUsageRecord

import org.jooq.Field
import org.jooq.ForeignKey
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
open class ViewTableUsage(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ViewTableUsageRecord>?,
    aliased: Table<ViewTableUsageRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ViewTableUsageRecord>(
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
         * <code>information_schema.VIEW_TABLE_USAGE</code>
         */
        val VIEW_TABLE_USAGE: ViewTableUsage = ViewTableUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ViewTableUsageRecord> = ViewTableUsageRecord::class.java

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_CATALOG</code>.
     */
    val VIEW_CATALOG: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("VIEW_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_SCHEMA</code>.
     */
    val VIEW_SCHEMA: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("VIEW_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_NAME</code>.
     */
    val VIEW_NAME: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("VIEW_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.VIEW_TABLE_USAGE.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ViewTableUsageRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ViewTableUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.VIEW_TABLE_USAGE</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.VIEW_TABLE_USAGE</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.VIEW_TABLE_USAGE</code> table reference
     */
    constructor(): this(DSL.name("VIEW_TABLE_USAGE"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ViewTableUsageRecord>): this(Internal.createPathAlias(child, key), child, key, VIEW_TABLE_USAGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ViewTableUsage = ViewTableUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): ViewTableUsage = ViewTableUsage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ViewTableUsage = ViewTableUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ViewTableUsage = ViewTableUsage(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row6<String?, String?, String?, String?, String?, String?>
}
