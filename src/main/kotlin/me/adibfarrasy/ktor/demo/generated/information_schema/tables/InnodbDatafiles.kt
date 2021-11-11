/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbDatafilesRecord

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
open class InnodbDatafiles(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbDatafilesRecord>?,
    aliased: Table<InnodbDatafilesRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbDatafilesRecord>(
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
         * <code>information_schema.INNODB_DATAFILES</code>
         */
        val INNODB_DATAFILES: InnodbDatafiles = InnodbDatafiles()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbDatafilesRecord> = InnodbDatafilesRecord::class.java

    /**
     * The column <code>information_schema.INNODB_DATAFILES.SPACE</code>.
     */
    val SPACE: TableField<InnodbDatafilesRecord, ByteArray?> = createField(DSL.name("SPACE"), SQLDataType.VARBINARY(256), this, "")

    /**
     * The column <code>information_schema.INNODB_DATAFILES.PATH</code>.
     */
    val PATH: TableField<InnodbDatafilesRecord, String?> = createField(DSL.name("PATH"), SQLDataType.VARCHAR(512).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<InnodbDatafilesRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbDatafilesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_DATAFILES</code> table reference
     */
    constructor(): this(DSL.name("INNODB_DATAFILES"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbDatafilesRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_DATAFILES, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbDatafiles = InnodbDatafiles(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbDatafiles = InnodbDatafiles(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbDatafiles = InnodbDatafiles(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbDatafiles = InnodbDatafiles(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<ByteArray?, String?> = super.fieldsRow() as Row2<ByteArray?, String?>
}