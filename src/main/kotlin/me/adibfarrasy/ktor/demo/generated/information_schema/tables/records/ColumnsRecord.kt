/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.enums.ColumnsColumnKey
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.Columns

import org.jooq.Field
import org.jooq.Record22
import org.jooq.Row22
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ColumnsRecord() : TableRecordImpl<ColumnsRecord>(Columns.COLUMNS), Record22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?> {

    var tableCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var tableSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var tableName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var columnName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    var ordinalPosition: UInteger?
        set(value): Unit = set(4, value)
        get(): UInteger? = get(4) as UInteger?

    var columnDefault: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @set:JvmName("setIsNullable")
    var isNullable: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    var dataType: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    var characterMaximumLength: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    var characterOctetLength: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    var numericPrecision: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    var numericScale: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    var datetimePrecision: UInteger?
        set(value): Unit = set(12, value)
        get(): UInteger? = get(12) as UInteger?

    var characterSetName: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    var collationName: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    var columnType: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    var columnKey: ColumnsColumnKey?
        set(value): Unit = set(16, value)
        get(): ColumnsColumnKey? = get(16) as ColumnsColumnKey?

    var extra: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    var privileges: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    var columnComment: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    var generationExpression: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    var srsId: UInteger?
        set(value): Unit = set(21, value)
        get(): UInteger? = get(21) as UInteger?

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?> = super.fieldsRow() as Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?>
    override fun valuesRow(): Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?> = super.valuesRow() as Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?>
    override fun field1(): Field<String?> = Columns.COLUMNS.TABLE_CATALOG
    override fun field2(): Field<String?> = Columns.COLUMNS.TABLE_SCHEMA
    override fun field3(): Field<String?> = Columns.COLUMNS.TABLE_NAME
    override fun field4(): Field<String?> = Columns.COLUMNS.COLUMN_NAME
    override fun field5(): Field<UInteger?> = Columns.COLUMNS.ORDINAL_POSITION
    override fun field6(): Field<String?> = Columns.COLUMNS.COLUMN_DEFAULT
    override fun field7(): Field<String?> = Columns.COLUMNS.IS_NULLABLE
    override fun field8(): Field<String?> = Columns.COLUMNS.DATA_TYPE
    override fun field9(): Field<Long?> = Columns.COLUMNS.CHARACTER_MAXIMUM_LENGTH
    override fun field10(): Field<Long?> = Columns.COLUMNS.CHARACTER_OCTET_LENGTH
    override fun field11(): Field<ULong?> = Columns.COLUMNS.NUMERIC_PRECISION
    override fun field12(): Field<ULong?> = Columns.COLUMNS.NUMERIC_SCALE
    override fun field13(): Field<UInteger?> = Columns.COLUMNS.DATETIME_PRECISION
    override fun field14(): Field<String?> = Columns.COLUMNS.CHARACTER_SET_NAME
    override fun field15(): Field<String?> = Columns.COLUMNS.COLLATION_NAME
    override fun field16(): Field<String?> = Columns.COLUMNS.COLUMN_TYPE
    override fun field17(): Field<ColumnsColumnKey?> = Columns.COLUMNS.COLUMN_KEY
    override fun field18(): Field<String?> = Columns.COLUMNS.EXTRA
    override fun field19(): Field<String?> = Columns.COLUMNS.PRIVILEGES
    override fun field20(): Field<String?> = Columns.COLUMNS.COLUMN_COMMENT
    override fun field21(): Field<String?> = Columns.COLUMNS.GENERATION_EXPRESSION
    override fun field22(): Field<UInteger?> = Columns.COLUMNS.SRS_ID
    override fun component1(): String? = tableCatalog
    override fun component2(): String? = tableSchema
    override fun component3(): String? = tableName
    override fun component4(): String? = columnName
    override fun component5(): UInteger? = ordinalPosition
    override fun component6(): String? = columnDefault
    override fun component7(): String? = isNullable
    override fun component8(): String? = dataType
    override fun component9(): Long? = characterMaximumLength
    override fun component10(): Long? = characterOctetLength
    override fun component11(): ULong? = numericPrecision
    override fun component12(): ULong? = numericScale
    override fun component13(): UInteger? = datetimePrecision
    override fun component14(): String? = characterSetName
    override fun component15(): String? = collationName
    override fun component16(): String? = columnType
    override fun component17(): ColumnsColumnKey? = columnKey
    override fun component18(): String? = extra
    override fun component19(): String? = privileges
    override fun component20(): String? = columnComment
    override fun component21(): String? = generationExpression
    override fun component22(): UInteger? = srsId
    override fun value1(): String? = tableCatalog
    override fun value2(): String? = tableSchema
    override fun value3(): String? = tableName
    override fun value4(): String? = columnName
    override fun value5(): UInteger? = ordinalPosition
    override fun value6(): String? = columnDefault
    override fun value7(): String? = isNullable
    override fun value8(): String? = dataType
    override fun value9(): Long? = characterMaximumLength
    override fun value10(): Long? = characterOctetLength
    override fun value11(): ULong? = numericPrecision
    override fun value12(): ULong? = numericScale
    override fun value13(): UInteger? = datetimePrecision
    override fun value14(): String? = characterSetName
    override fun value15(): String? = collationName
    override fun value16(): String? = columnType
    override fun value17(): ColumnsColumnKey? = columnKey
    override fun value18(): String? = extra
    override fun value19(): String? = privileges
    override fun value20(): String? = columnComment
    override fun value21(): String? = generationExpression
    override fun value22(): UInteger? = srsId

    override fun value1(value: String?): ColumnsRecord {
        this.tableCatalog = value
        return this
    }

    override fun value2(value: String?): ColumnsRecord {
        this.tableSchema = value
        return this
    }

    override fun value3(value: String?): ColumnsRecord {
        this.tableName = value
        return this
    }

    override fun value4(value: String?): ColumnsRecord {
        this.columnName = value
        return this
    }

    override fun value5(value: UInteger?): ColumnsRecord {
        this.ordinalPosition = value
        return this
    }

    override fun value6(value: String?): ColumnsRecord {
        this.columnDefault = value
        return this
    }

    override fun value7(value: String?): ColumnsRecord {
        this.isNullable = value
        return this
    }

    override fun value8(value: String?): ColumnsRecord {
        this.dataType = value
        return this
    }

    override fun value9(value: Long?): ColumnsRecord {
        this.characterMaximumLength = value
        return this
    }

    override fun value10(value: Long?): ColumnsRecord {
        this.characterOctetLength = value
        return this
    }

    override fun value11(value: ULong?): ColumnsRecord {
        this.numericPrecision = value
        return this
    }

    override fun value12(value: ULong?): ColumnsRecord {
        this.numericScale = value
        return this
    }

    override fun value13(value: UInteger?): ColumnsRecord {
        this.datetimePrecision = value
        return this
    }

    override fun value14(value: String?): ColumnsRecord {
        this.characterSetName = value
        return this
    }

    override fun value15(value: String?): ColumnsRecord {
        this.collationName = value
        return this
    }

    override fun value16(value: String?): ColumnsRecord {
        this.columnType = value
        return this
    }

    override fun value17(value: ColumnsColumnKey?): ColumnsRecord {
        this.columnKey = value
        return this
    }

    override fun value18(value: String?): ColumnsRecord {
        this.extra = value
        return this
    }

    override fun value19(value: String?): ColumnsRecord {
        this.privileges = value
        return this
    }

    override fun value20(value: String?): ColumnsRecord {
        this.columnComment = value
        return this
    }

    override fun value21(value: String?): ColumnsRecord {
        this.generationExpression = value
        return this
    }

    override fun value22(value: UInteger?): ColumnsRecord {
        this.srsId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: UInteger?, value6: String?, value7: String?, value8: String?, value9: Long?, value10: Long?, value11: ULong?, value12: ULong?, value13: UInteger?, value14: String?, value15: String?, value16: String?, value17: ColumnsColumnKey?, value18: String?, value19: String?, value20: String?, value21: String?, value22: UInteger?): ColumnsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        this.value15(value15)
        this.value16(value16)
        this.value17(value17)
        this.value18(value18)
        this.value19(value19)
        this.value20(value20)
        this.value21(value21)
        this.value22(value22)
        return this
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    constructor(tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null, ordinalPosition: UInteger? = null, columnDefault: String? = null, isNullable: String? = null, dataType: String? = null, characterMaximumLength: Long? = null, characterOctetLength: Long? = null, numericPrecision: ULong? = null, numericScale: ULong? = null, datetimePrecision: UInteger? = null, characterSetName: String? = null, collationName: String? = null, columnType: String? = null, columnKey: ColumnsColumnKey? = null, extra: String? = null, privileges: String? = null, columnComment: String? = null, generationExpression: String? = null, srsId: UInteger? = null): this() {
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        this.ordinalPosition = ordinalPosition
        this.columnDefault = columnDefault
        this.isNullable = isNullable
        this.dataType = dataType
        this.characterMaximumLength = characterMaximumLength
        this.characterOctetLength = characterOctetLength
        this.numericPrecision = numericPrecision
        this.numericScale = numericScale
        this.datetimePrecision = datetimePrecision
        this.characterSetName = characterSetName
        this.collationName = collationName
        this.columnType = columnType
        this.columnKey = columnKey
        this.extra = extra
        this.privileges = privileges
        this.columnComment = columnComment
        this.generationExpression = generationExpression
        this.srsId = srsId
    }
}
