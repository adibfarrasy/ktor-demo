/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbTempTableInfoRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row4
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
open class InnodbTempTableInfo(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbTempTableInfoRecord>?,
    aliased: Table<InnodbTempTableInfoRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbTempTableInfoRecord>(
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
         * <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
         */
        val INNODB_TEMP_TABLE_INFO: InnodbTempTableInfo = InnodbTempTableInfo()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbTempTableInfoRecord> = InnodbTempTableInfoRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    val TABLE_ID: TableField<InnodbTempTableInfoRecord, ULong?> = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    val NAME: TableField<InnodbTempTableInfoRecord, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    val N_COLS: TableField<InnodbTempTableInfoRecord, UInteger?> = createField(DSL.name("N_COLS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    val SPACE: TableField<InnodbTempTableInfoRecord, UInteger?> = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbTempTableInfoRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbTempTableInfoRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_TEMP_TABLE_INFO"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbTempTableInfoRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_TEMP_TABLE_INFO, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbTempTableInfo = InnodbTempTableInfo(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbTempTableInfo = InnodbTempTableInfo(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbTempTableInfo = InnodbTempTableInfo(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbTempTableInfo = InnodbTempTableInfo(name, null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<ULong?, String?, UInteger?, UInteger?> = super.fieldsRow() as Row4<ULong?, String?, UInteger?, UInteger?>
}