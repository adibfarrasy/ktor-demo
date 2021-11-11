/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbCmpResetRecord

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
open class InnodbCmpReset(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbCmpResetRecord>?,
    aliased: Table<InnodbCmpResetRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbCmpResetRecord>(
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
         * <code>information_schema.INNODB_CMP_RESET</code>
         */
        val INNODB_CMP_RESET: InnodbCmpReset = InnodbCmpReset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbCmpResetRecord> = InnodbCmpResetRecord::class.java

    /**
     * The column <code>information_schema.INNODB_CMP_RESET.page_size</code>.
     */
    val PAGE_SIZE: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP_RESET.compress_ops</code>.
     */
    val COMPRESS_OPS: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.compress_ops_ok</code>.
     */
    val COMPRESS_OPS_OK: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.compress_time</code>.
     */
    val COMPRESS_TIME: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.uncompress_ops</code>.
     */
    val UNCOMPRESS_OPS: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.uncompress_time</code>.
     */
    val UNCOMPRESS_TIME: TableField<InnodbCmpResetRecord, Int?> = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbCmpResetRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbCmpResetRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_CMP_RESET</code> table reference
     */
    constructor(): this(DSL.name("INNODB_CMP_RESET"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbCmpResetRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_CMP_RESET, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbCmpReset = InnodbCmpReset(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbCmpReset = InnodbCmpReset(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbCmpReset = InnodbCmpReset(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbCmpReset = InnodbCmpReset(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Int?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row6<Int?, Int?, Int?, Int?, Int?, Int?>
}