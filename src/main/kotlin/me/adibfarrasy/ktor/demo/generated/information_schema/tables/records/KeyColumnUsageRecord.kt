/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.KeyColumnUsage

import org.jooq.Field
import org.jooq.Record12
import org.jooq.Row12
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KeyColumnUsageRecord() : TableRecordImpl<KeyColumnUsageRecord>(KeyColumnUsage.KEY_COLUMN_USAGE), Record12<String?, String?, String?, String?, String?, String?, String?, UInteger?, UInteger?, String?, String?, String?> {

    var constraintCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var constraintSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var constraintName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var tableCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    var tableSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    var tableName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    var columnName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    var ordinalPosition: UInteger?
        set(value): Unit = set(7, value)
        get(): UInteger? = get(7) as UInteger?

    var positionInUniqueConstraint: UInteger?
        set(value): Unit = set(8, value)
        get(): UInteger? = get(8) as UInteger?

    var referencedTableSchema: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    var referencedTableName: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    var referencedColumnName: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row12<String?, String?, String?, String?, String?, String?, String?, UInteger?, UInteger?, String?, String?, String?> = super.fieldsRow() as Row12<String?, String?, String?, String?, String?, String?, String?, UInteger?, UInteger?, String?, String?, String?>
    override fun valuesRow(): Row12<String?, String?, String?, String?, String?, String?, String?, UInteger?, UInteger?, String?, String?, String?> = super.valuesRow() as Row12<String?, String?, String?, String?, String?, String?, String?, UInteger?, UInteger?, String?, String?, String?>
    override fun field1(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG
    override fun field2(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA
    override fun field3(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_NAME
    override fun field4(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_CATALOG
    override fun field5(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_SCHEMA
    override fun field6(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_NAME
    override fun field7(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.COLUMN_NAME
    override fun field8(): Field<UInteger?> = KeyColumnUsage.KEY_COLUMN_USAGE.ORDINAL_POSITION
    override fun field9(): Field<UInteger?> = KeyColumnUsage.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT
    override fun field10(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA
    override fun field11(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME
    override fun field12(): Field<String?> = KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME
    override fun component1(): String? = constraintCatalog
    override fun component2(): String? = constraintSchema
    override fun component3(): String? = constraintName
    override fun component4(): String? = tableCatalog
    override fun component5(): String? = tableSchema
    override fun component6(): String? = tableName
    override fun component7(): String? = columnName
    override fun component8(): UInteger? = ordinalPosition
    override fun component9(): UInteger? = positionInUniqueConstraint
    override fun component10(): String? = referencedTableSchema
    override fun component11(): String? = referencedTableName
    override fun component12(): String? = referencedColumnName
    override fun value1(): String? = constraintCatalog
    override fun value2(): String? = constraintSchema
    override fun value3(): String? = constraintName
    override fun value4(): String? = tableCatalog
    override fun value5(): String? = tableSchema
    override fun value6(): String? = tableName
    override fun value7(): String? = columnName
    override fun value8(): UInteger? = ordinalPosition
    override fun value9(): UInteger? = positionInUniqueConstraint
    override fun value10(): String? = referencedTableSchema
    override fun value11(): String? = referencedTableName
    override fun value12(): String? = referencedColumnName

    override fun value1(value: String?): KeyColumnUsageRecord {
        this.constraintCatalog = value
        return this
    }

    override fun value2(value: String?): KeyColumnUsageRecord {
        this.constraintSchema = value
        return this
    }

    override fun value3(value: String?): KeyColumnUsageRecord {
        this.constraintName = value
        return this
    }

    override fun value4(value: String?): KeyColumnUsageRecord {
        this.tableCatalog = value
        return this
    }

    override fun value5(value: String?): KeyColumnUsageRecord {
        this.tableSchema = value
        return this
    }

    override fun value6(value: String?): KeyColumnUsageRecord {
        this.tableName = value
        return this
    }

    override fun value7(value: String?): KeyColumnUsageRecord {
        this.columnName = value
        return this
    }

    override fun value8(value: UInteger?): KeyColumnUsageRecord {
        this.ordinalPosition = value
        return this
    }

    override fun value9(value: UInteger?): KeyColumnUsageRecord {
        this.positionInUniqueConstraint = value
        return this
    }

    override fun value10(value: String?): KeyColumnUsageRecord {
        this.referencedTableSchema = value
        return this
    }

    override fun value11(value: String?): KeyColumnUsageRecord {
        this.referencedTableName = value
        return this
    }

    override fun value12(value: String?): KeyColumnUsageRecord {
        this.referencedColumnName = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: UInteger?, value9: UInteger?, value10: String?, value11: String?, value12: String?): KeyColumnUsageRecord {
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
        return this
    }

    /**
     * Create a detached, initialised KeyColumnUsageRecord
     */
    constructor(constraintCatalog: String? = null, constraintSchema: String? = null, constraintName: String? = null, tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null, ordinalPosition: UInteger? = null, positionInUniqueConstraint: UInteger? = null, referencedTableSchema: String? = null, referencedTableName: String? = null, referencedColumnName: String? = null): this() {
        this.constraintCatalog = constraintCatalog
        this.constraintSchema = constraintSchema
        this.constraintName = constraintName
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        this.ordinalPosition = ordinalPosition
        this.positionInUniqueConstraint = positionInUniqueConstraint
        this.referencedTableSchema = referencedTableSchema
        this.referencedTableName = referencedTableName
        this.referencedColumnName = referencedColumnName
    }
}
