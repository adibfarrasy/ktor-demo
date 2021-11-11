/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.StUnitsOfMeasureRecord

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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StUnitsOfMeasure(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, StUnitsOfMeasureRecord>?,
    aliased: Table<StUnitsOfMeasureRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<StUnitsOfMeasureRecord>(
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
         * <code>information_schema.ST_UNITS_OF_MEASURE</code>
         */
        val ST_UNITS_OF_MEASURE: StUnitsOfMeasure = StUnitsOfMeasure()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StUnitsOfMeasureRecord> = StUnitsOfMeasureRecord::class.java

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_NAME</code>.
     */
    val UNIT_NAME: TableField<StUnitsOfMeasureRecord, String?> = createField(DSL.name("UNIT_NAME"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_TYPE</code>.
     */
    val UNIT_TYPE: TableField<StUnitsOfMeasureRecord, String?> = createField(DSL.name("UNIT_TYPE"), SQLDataType.VARCHAR(7), this, "")

    /**
     * The column
     * <code>information_schema.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR</code>.
     */
    val CONVERSION_FACTOR: TableField<StUnitsOfMeasureRecord, Double?> = createField(DSL.name("CONVERSION_FACTOR"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>information_schema.ST_UNITS_OF_MEASURE.DESCRIPTION</code>.
     */
    val DESCRIPTION: TableField<StUnitsOfMeasureRecord, String?> = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<StUnitsOfMeasureRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<StUnitsOfMeasureRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.ST_UNITS_OF_MEASURE</code> table
     * reference
     */
    constructor(): this(DSL.name("ST_UNITS_OF_MEASURE"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, StUnitsOfMeasureRecord>): this(Internal.createPathAlias(child, key), child, key, ST_UNITS_OF_MEASURE, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): StUnitsOfMeasure = StUnitsOfMeasure(DSL.name(alias), this)
    override fun `as`(alias: Name): StUnitsOfMeasure = StUnitsOfMeasure(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): StUnitsOfMeasure = StUnitsOfMeasure(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): StUnitsOfMeasure = StUnitsOfMeasure(name, null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, Double?, String?> = super.fieldsRow() as Row4<String?, String?, Double?, String?>
}
