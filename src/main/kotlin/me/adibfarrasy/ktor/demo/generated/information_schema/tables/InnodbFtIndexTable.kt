/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbFtIndexTableRecord

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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbFtIndexTable(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbFtIndexTableRecord>?,
    aliased: Table<InnodbFtIndexTableRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbFtIndexTableRecord>(
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
         * <code>information_schema.INNODB_FT_INDEX_TABLE</code>
         */
        val INNODB_FT_INDEX_TABLE: InnodbFtIndexTable = InnodbFtIndexTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbFtIndexTableRecord> = InnodbFtIndexTableRecord::class.java

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_TABLE.WORD</code>.
     */
    val WORD: TableField<InnodbFtIndexTableRecord, String?> = createField(DSL.name("WORD"), SQLDataType.VARCHAR(112).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID</code>.
     */
    val FIRST_DOC_ID: TableField<InnodbFtIndexTableRecord, ULong?> = createField(DSL.name("FIRST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.LAST_DOC_ID</code>.
     */
    val LAST_DOC_ID: TableField<InnodbFtIndexTableRecord, ULong?> = createField(DSL.name("LAST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_COUNT</code>.
     */
    val DOC_COUNT: TableField<InnodbFtIndexTableRecord, ULong?> = createField(DSL.name("DOC_COUNT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_ID</code>.
     */
    val DOC_ID: TableField<InnodbFtIndexTableRecord, ULong?> = createField(DSL.name("DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.POSITION</code>.
     */
    val POSITION: TableField<InnodbFtIndexTableRecord, ULong?> = createField(DSL.name("POSITION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbFtIndexTableRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbFtIndexTableRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_TABLE</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_TABLE</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_FT_INDEX_TABLE</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_FT_INDEX_TABLE"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbFtIndexTableRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_FT_INDEX_TABLE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbFtIndexTable = InnodbFtIndexTable(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbFtIndexTable = InnodbFtIndexTable(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbFtIndexTable = InnodbFtIndexTable(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbFtIndexTable = InnodbFtIndexTable(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row6<String?, ULong?, ULong?, ULong?, ULong?, ULong?>
}
