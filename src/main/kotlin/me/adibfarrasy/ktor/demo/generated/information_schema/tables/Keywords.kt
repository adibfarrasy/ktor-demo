/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.KeywordsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row2
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
open class Keywords(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, KeywordsRecord>?,
    aliased: Table<KeywordsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<KeywordsRecord>(
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
         * The reference instance of <code>information_schema.KEYWORDS</code>
         */
        val KEYWORDS: Keywords = Keywords()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KeywordsRecord> = KeywordsRecord::class.java

    /**
     * The column <code>information_schema.KEYWORDS.WORD</code>.
     */
    val WORD: TableField<KeywordsRecord, String?> = createField(DSL.name("WORD"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>information_schema.KEYWORDS.RESERVED</code>.
     */
    val RESERVED: TableField<KeywordsRecord, Int?> = createField(DSL.name("RESERVED"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<KeywordsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<KeywordsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.KEYWORDS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.KEYWORDS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.KEYWORDS</code> table reference
     */
    constructor(): this(DSL.name("KEYWORDS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, KeywordsRecord>): this(Internal.createPathAlias(child, key), child, key, KEYWORDS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Keywords = Keywords(DSL.name(alias), this)
    override fun `as`(alias: Name): Keywords = Keywords(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Keywords = Keywords(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Keywords = Keywords(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, Int?> = super.fieldsRow() as Row2<String?, Int?>
}