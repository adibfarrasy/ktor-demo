/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.PluginsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row11
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
open class Plugins(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PluginsRecord>?,
    aliased: Table<PluginsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<PluginsRecord>(
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
         * The reference instance of <code>information_schema.PLUGINS</code>
         */
        val PLUGINS: Plugins = Plugins()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PluginsRecord> = PluginsRecord::class.java

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
     */
    val PLUGIN_NAME: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_NAME"), SQLDataType.VARCHAR(21).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
     */
    val PLUGIN_VERSION: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_VERSION"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
     */
    val PLUGIN_STATUS: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_STATUS"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
     */
    val PLUGIN_TYPE: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_TYPE"), SQLDataType.VARCHAR(26).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    val PLUGIN_TYPE_VERSION: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_TYPE_VERSION"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
     */
    val PLUGIN_LIBRARY: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_LIBRARY"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    val PLUGIN_LIBRARY_VERSION: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_LIBRARY_VERSION"), SQLDataType.VARCHAR(6).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
     */
    val PLUGIN_AUTHOR: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_AUTHOR"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    val PLUGIN_DESCRIPTION: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_DESCRIPTION"), SQLDataType.VARCHAR(21845).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
     */
    val PLUGIN_LICENSE: TableField<PluginsRecord, String?> = createField(DSL.name("PLUGIN_LICENSE"), SQLDataType.VARCHAR(26).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PLUGINS.LOAD_OPTION</code>.
     */
    val LOAD_OPTION: TableField<PluginsRecord, String?> = createField(DSL.name("LOAD_OPTION"), SQLDataType.VARCHAR(21).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<PluginsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PluginsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.PLUGINS</code> table reference
     */
    constructor(): this(DSL.name("PLUGINS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, PluginsRecord>): this(Internal.createPathAlias(child, key), child, key, PLUGINS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Plugins = Plugins(DSL.name(alias), this)
    override fun `as`(alias: Name): Plugins = Plugins(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Plugins = Plugins(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Plugins = Plugins(name, null)

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row11<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row11<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?>
}
