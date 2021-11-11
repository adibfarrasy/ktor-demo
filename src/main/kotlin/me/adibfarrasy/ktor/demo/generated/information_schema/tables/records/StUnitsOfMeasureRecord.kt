/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.StUnitsOfMeasure

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StUnitsOfMeasureRecord() : TableRecordImpl<StUnitsOfMeasureRecord>(StUnitsOfMeasure.ST_UNITS_OF_MEASURE), Record4<String?, String?, Double?, String?> {

    var unitName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var unitType: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var conversionFactor: Double?
        set(value): Unit = set(2, value)
        get(): Double? = get(2) as Double?

    var description: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, String?, Double?, String?> = super.fieldsRow() as Row4<String?, String?, Double?, String?>
    override fun valuesRow(): Row4<String?, String?, Double?, String?> = super.valuesRow() as Row4<String?, String?, Double?, String?>
    override fun field1(): Field<String?> = StUnitsOfMeasure.ST_UNITS_OF_MEASURE.UNIT_NAME
    override fun field2(): Field<String?> = StUnitsOfMeasure.ST_UNITS_OF_MEASURE.UNIT_TYPE
    override fun field3(): Field<Double?> = StUnitsOfMeasure.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR
    override fun field4(): Field<String?> = StUnitsOfMeasure.ST_UNITS_OF_MEASURE.DESCRIPTION
    override fun component1(): String? = unitName
    override fun component2(): String? = unitType
    override fun component3(): Double? = conversionFactor
    override fun component4(): String? = description
    override fun value1(): String? = unitName
    override fun value2(): String? = unitType
    override fun value3(): Double? = conversionFactor
    override fun value4(): String? = description

    override fun value1(value: String?): StUnitsOfMeasureRecord {
        this.unitName = value
        return this
    }

    override fun value2(value: String?): StUnitsOfMeasureRecord {
        this.unitType = value
        return this
    }

    override fun value3(value: Double?): StUnitsOfMeasureRecord {
        this.conversionFactor = value
        return this
    }

    override fun value4(value: String?): StUnitsOfMeasureRecord {
        this.description = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Double?, value4: String?): StUnitsOfMeasureRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised StUnitsOfMeasureRecord
     */
    constructor(unitName: String? = null, unitType: String? = null, conversionFactor: Double? = null, description: String? = null): this() {
        this.unitName = unitName
        this.unitType = unitType
        this.conversionFactor = conversionFactor
        this.description = description
    }
}