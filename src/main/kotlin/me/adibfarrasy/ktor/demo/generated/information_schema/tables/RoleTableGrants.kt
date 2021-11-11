/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.RoleTableGrantsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row9
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
open class RoleTableGrants(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, RoleTableGrantsRecord>?,
    aliased: Table<RoleTableGrantsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<RoleTableGrantsRecord>(
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
         * <code>information_schema.ROLE_TABLE_GRANTS</code>
         */
        val ROLE_TABLE_GRANTS: RoleTableGrants = RoleTableGrants()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoleTableGrantsRecord> = RoleTableGrantsRecord::class.java

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR</code>.
     */
    val GRANTOR: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("GRANTOR"), SQLDataType.VARCHAR(97), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR_HOST</code>.
     */
    val GRANTOR_HOST: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("GRANTOR_HOST"), SQLDataType.VARCHAR(256), this, "")

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE</code>.
     */
    val GRANTEE: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("GRANTEE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE_HOST</code>.
     */
    val GRANTEE_HOST: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("GRANTEE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    val PRIVILEGE_TYPE: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(98).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.IS_GRANTABLE</code>.
     */
    val IS_GRANTABLE: TableField<RoleTableGrantsRecord, String?> = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<RoleTableGrantsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<RoleTableGrantsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    constructor(): this(DSL.name("ROLE_TABLE_GRANTS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, RoleTableGrantsRecord>): this(Internal.createPathAlias(child, key), child, key, ROLE_TABLE_GRANTS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): RoleTableGrants = RoleTableGrants(DSL.name(alias), this)
    override fun `as`(alias: Name): RoleTableGrants = RoleTableGrants(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoleTableGrants = RoleTableGrants(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoleTableGrants = RoleTableGrants(name, null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?>
}
