/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbFtConfigRecord

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
open class InnodbFtConfig(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbFtConfigRecord>?,
    aliased: Table<InnodbFtConfigRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbFtConfigRecord>(
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
         * <code>information_schema.INNODB_FT_CONFIG</code>
         */
        val INNODB_FT_CONFIG: InnodbFtConfig = InnodbFtConfig()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbFtConfigRecord> = InnodbFtConfigRecord::class.java

    /**
     * The column <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
     */
    val KEY: TableField<InnodbFtConfigRecord, String?> = createField(DSL.name("KEY"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
     */
    val VALUE: TableField<InnodbFtConfigRecord, String?> = createField(DSL.name("VALUE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbFtConfigRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbFtConfigRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_FT_CONFIG</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_FT_CONFIG</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_FT_CONFIG</code> table reference
     */
    constructor(): this(DSL.name("INNODB_FT_CONFIG"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbFtConfigRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_FT_CONFIG, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbFtConfig = InnodbFtConfig(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbFtConfig = InnodbFtConfig(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbFtConfig = InnodbFtConfig(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbFtConfig = InnodbFtConfig(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>
}
