/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbCmpPerIndexResetRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
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
open class InnodbCmpPerIndexReset(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbCmpPerIndexResetRecord>?,
    aliased: Table<InnodbCmpPerIndexResetRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbCmpPerIndexResetRecord>(
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
         * <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>
         */
        val INNODB_CMP_PER_INDEX_RESET: InnodbCmpPerIndexReset = InnodbCmpPerIndexReset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbCmpPerIndexResetRecord> = InnodbCmpPerIndexResetRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.database_name</code>.
     */
    val DATABASE_NAME: TableField<InnodbCmpPerIndexResetRecord, String?> = createField(DSL.name("database_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.table_name</code>.
     */
    val TABLE_NAME: TableField<InnodbCmpPerIndexResetRecord, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.index_name</code>.
     */
    val INDEX_NAME: TableField<InnodbCmpPerIndexResetRecord, String?> = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops</code>.
     */
    val COMPRESS_OPS: TableField<InnodbCmpPerIndexResetRecord, Int?> = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops_ok</code>.
     */
    val COMPRESS_OPS_OK: TableField<InnodbCmpPerIndexResetRecord, Int?> = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_time</code>.
     */
    val COMPRESS_TIME: TableField<InnodbCmpPerIndexResetRecord, Int?> = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_ops</code>.
     */
    val UNCOMPRESS_OPS: TableField<InnodbCmpPerIndexResetRecord, Int?> = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_time</code>.
     */
    val UNCOMPRESS_TIME: TableField<InnodbCmpPerIndexResetRecord, Int?> = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbCmpPerIndexResetRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbCmpPerIndexResetRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_CMP_PER_INDEX_RESET"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbCmpPerIndexResetRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_CMP_PER_INDEX_RESET, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbCmpPerIndexReset = InnodbCmpPerIndexReset(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbCmpPerIndexReset = InnodbCmpPerIndexReset(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbCmpPerIndexReset = InnodbCmpPerIndexReset(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbCmpPerIndexReset = InnodbCmpPerIndexReset(name, null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?>
}