/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.enums.CollationsPadAttribute
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.CollationsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row7
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
open class Collations(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CollationsRecord>?,
    aliased: Table<CollationsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CollationsRecord>(
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
         * The reference instance of <code>information_schema.COLLATIONS</code>
         */
        val COLLATIONS: Collations = Collations()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CollationsRecord> = CollationsRecord::class.java

    /**
     * The column <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
     */
    val COLLATION_NAME: TableField<CollationsRecord, String?> = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
     */
    val CHARACTER_SET_NAME: TableField<CollationsRecord, String?> = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.ID</code>.
     */
    val ID: TableField<CollationsRecord, ULong?> = createField(DSL.name("ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
     */
    val IS_DEFAULT: TableField<CollationsRecord, String?> = createField(DSL.name("IS_DEFAULT"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.IS_COMPILED</code>.
     */
    val IS_COMPILED: TableField<CollationsRecord, String?> = createField(DSL.name("IS_COMPILED"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.SORTLEN</code>.
     */
    val SORTLEN: TableField<CollationsRecord, UInteger?> = createField(DSL.name("SORTLEN"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>information_schema.COLLATIONS.PAD_ATTRIBUTE</code>.
     */
    val PAD_ATTRIBUTE: TableField<CollationsRecord, CollationsPadAttribute?> = createField(DSL.name("PAD_ATTRIBUTE"), SQLDataType.VARCHAR(9).nullable(false).asEnumDataType(me.adibfarrasy.ktor.demo.generated.information_schema.enums.CollationsPadAttribute::class.java), this, "")

    private constructor(alias: Name, aliased: Table<CollationsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CollationsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.COLLATIONS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.COLLATIONS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.COLLATIONS</code> table reference
     */
    constructor(): this(DSL.name("COLLATIONS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CollationsRecord>): this(Internal.createPathAlias(child, key), child, key, COLLATIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Collations = Collations(DSL.name(alias), this)
    override fun `as`(alias: Name): Collations = Collations(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Collations = Collations(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Collations = Collations(name, null)

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?> = super.fieldsRow() as Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?>
}