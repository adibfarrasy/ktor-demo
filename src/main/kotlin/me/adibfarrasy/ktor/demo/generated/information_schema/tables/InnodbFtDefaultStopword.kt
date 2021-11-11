/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbFtDefaultStopwordRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row1
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
open class InnodbFtDefaultStopword(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbFtDefaultStopwordRecord>?,
    aliased: Table<InnodbFtDefaultStopwordRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbFtDefaultStopwordRecord>(
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
         * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>
         */
        val INNODB_FT_DEFAULT_STOPWORD: InnodbFtDefaultStopword = InnodbFtDefaultStopword()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbFtDefaultStopwordRecord> = InnodbFtDefaultStopwordRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    val VALUE: TableField<InnodbFtDefaultStopwordRecord, String?> = createField(DSL.name("value"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbFtDefaultStopwordRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbFtDefaultStopwordRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_FT_DEFAULT_STOPWORD"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbFtDefaultStopwordRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_FT_DEFAULT_STOPWORD, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbFtDefaultStopword = InnodbFtDefaultStopword(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbFtDefaultStopword = InnodbFtDefaultStopword(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbFtDefaultStopword = InnodbFtDefaultStopword(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbFtDefaultStopword = InnodbFtDefaultStopword(name, null)

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<String?> = super.fieldsRow() as Row1<String?>
}
