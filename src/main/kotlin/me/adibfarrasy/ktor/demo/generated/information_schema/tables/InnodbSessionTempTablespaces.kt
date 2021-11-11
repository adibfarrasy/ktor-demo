/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbSessionTempTablespacesRecord

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
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbSessionTempTablespaces(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbSessionTempTablespacesRecord>?,
    aliased: Table<InnodbSessionTempTablespacesRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbSessionTempTablespacesRecord>(
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
         * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>
         */
        val INNODB_SESSION_TEMP_TABLESPACES: InnodbSessionTempTablespaces = InnodbSessionTempTablespaces()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbSessionTempTablespacesRecord> = InnodbSessionTempTablespacesRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.ID</code>.
     */
    val ID: TableField<InnodbSessionTempTablespacesRecord, UInteger?> = createField(DSL.name("ID"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SPACE</code>.
     */
    val SPACE: TableField<InnodbSessionTempTablespacesRecord, UInteger?> = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PATH</code>.
     */
    val PATH: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("PATH"), SQLDataType.VARCHAR(1333).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SIZE</code>.
     */
    val SIZE: TableField<InnodbSessionTempTablespacesRecord, ULong?> = createField(DSL.name("SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.STATE</code>.
     */
    val STATE: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("STATE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PURPOSE</code>.
     */
    val PURPOSE: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("PURPOSE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbSessionTempTablespacesRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbSessionTempTablespacesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>
     * table reference
     */
    constructor(): this(DSL.name("INNODB_SESSION_TEMP_TABLESPACES"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbSessionTempTablespacesRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_SESSION_TEMP_TABLESPACES, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<UInteger?, UInteger?, String?, ULong?, String?, String?> = super.fieldsRow() as Row6<UInteger?, UInteger?, String?, ULong?, String?, String?>
}
