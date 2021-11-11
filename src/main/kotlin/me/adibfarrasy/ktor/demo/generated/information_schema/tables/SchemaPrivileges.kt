/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.SchemaPrivilegesRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row5
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
open class SchemaPrivileges(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SchemaPrivilegesRecord>?,
    aliased: Table<SchemaPrivilegesRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SchemaPrivilegesRecord>(
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
         * <code>information_schema.SCHEMA_PRIVILEGES</code>
         */
        val SCHEMA_PRIVILEGES: SchemaPrivileges = SchemaPrivileges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchemaPrivilegesRecord> = SchemaPrivilegesRecord::class.java

    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    val GRANTEE: TableField<SchemaPrivilegesRecord, String?> = createField(DSL.name("GRANTEE"), SQLDataType.VARCHAR(97).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<SchemaPrivilegesRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(170).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<SchemaPrivilegesRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(21).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    val PRIVILEGE_TYPE: TableField<SchemaPrivilegesRecord, String?> = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(21).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    val IS_GRANTABLE: TableField<SchemaPrivilegesRecord, String?> = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<SchemaPrivilegesRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SchemaPrivilegesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.SCHEMA_PRIVILEGES</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.SCHEMA_PRIVILEGES</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.SCHEMA_PRIVILEGES</code> table
     * reference
     */
    constructor(): this(DSL.name("SCHEMA_PRIVILEGES"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SchemaPrivilegesRecord>): this(Internal.createPathAlias(child, key), child, key, SCHEMA_PRIVILEGES, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): SchemaPrivileges = SchemaPrivileges(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemaPrivileges = SchemaPrivileges(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemaPrivileges = SchemaPrivileges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemaPrivileges = SchemaPrivileges(name, null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, String?, String?, String?> = super.fieldsRow() as Row5<String?, String?, String?, String?, String?>
}
