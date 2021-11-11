/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.ViewRoutineUsageRecord

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
open class ViewRoutineUsage(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ViewRoutineUsageRecord>?,
    aliased: Table<ViewRoutineUsageRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ViewRoutineUsageRecord>(
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
         * <code>information_schema.VIEW_ROUTINE_USAGE</code>
         */
        val VIEW_ROUTINE_USAGE: ViewRoutineUsage = ViewRoutineUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ViewRoutineUsageRecord> = ViewRoutineUsageRecord::class.java

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG</code>.
     */
    val SPECIFIC_CATALOG: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA</code>.
     */
    val SPECIFIC_SCHEMA: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_NAME</code>.
     */
    val SPECIFIC_NAME: TableField<ViewRoutineUsageRecord, String?> = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ViewRoutineUsageRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ViewRoutineUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.VIEW_ROUTINE_USAGE</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.VIEW_ROUTINE_USAGE</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.VIEW_ROUTINE_USAGE</code> table
     * reference
     */
    constructor(): this(DSL.name("VIEW_ROUTINE_USAGE"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ViewRoutineUsageRecord>): this(Internal.createPathAlias(child, key), child, key, VIEW_ROUTINE_USAGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ViewRoutineUsage = ViewRoutineUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): ViewRoutineUsage = ViewRoutineUsage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ViewRoutineUsage = ViewRoutineUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ViewRoutineUsage = ViewRoutineUsage(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row6<String?, String?, String?, String?, String?, String?>
}