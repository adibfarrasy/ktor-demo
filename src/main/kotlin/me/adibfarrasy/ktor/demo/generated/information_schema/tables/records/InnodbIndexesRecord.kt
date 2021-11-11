/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.InnodbIndexes

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbIndexesRecord() : TableRecordImpl<InnodbIndexesRecord>(InnodbIndexes.INNODB_INDEXES), Record8<ULong?, String?, ULong?, Int?, Int?, Int?, Int?, Int?> {

    var indexId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var tableId: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    var type: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    var nFields: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    var pageNo: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    var space: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    var mergeThreshold: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<ULong?, String?, ULong?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row8<ULong?, String?, ULong?, Int?, Int?, Int?, Int?, Int?>
    override fun valuesRow(): Row8<ULong?, String?, ULong?, Int?, Int?, Int?, Int?, Int?> = super.valuesRow() as Row8<ULong?, String?, ULong?, Int?, Int?, Int?, Int?, Int?>
    override fun field1(): Field<ULong?> = InnodbIndexes.INNODB_INDEXES.INDEX_ID
    override fun field2(): Field<String?> = InnodbIndexes.INNODB_INDEXES.NAME
    override fun field3(): Field<ULong?> = InnodbIndexes.INNODB_INDEXES.TABLE_ID
    override fun field4(): Field<Int?> = InnodbIndexes.INNODB_INDEXES.TYPE
    override fun field5(): Field<Int?> = InnodbIndexes.INNODB_INDEXES.N_FIELDS
    override fun field6(): Field<Int?> = InnodbIndexes.INNODB_INDEXES.PAGE_NO
    override fun field7(): Field<Int?> = InnodbIndexes.INNODB_INDEXES.SPACE
    override fun field8(): Field<Int?> = InnodbIndexes.INNODB_INDEXES.MERGE_THRESHOLD
    override fun component1(): ULong? = indexId
    override fun component2(): String? = name
    override fun component3(): ULong? = tableId
    override fun component4(): Int? = type
    override fun component5(): Int? = nFields
    override fun component6(): Int? = pageNo
    override fun component7(): Int? = space
    override fun component8(): Int? = mergeThreshold
    override fun value1(): ULong? = indexId
    override fun value2(): String? = name
    override fun value3(): ULong? = tableId
    override fun value4(): Int? = type
    override fun value5(): Int? = nFields
    override fun value6(): Int? = pageNo
    override fun value7(): Int? = space
    override fun value8(): Int? = mergeThreshold

    override fun value1(value: ULong?): InnodbIndexesRecord {
        this.indexId = value
        return this
    }

    override fun value2(value: String?): InnodbIndexesRecord {
        this.name = value
        return this
    }

    override fun value3(value: ULong?): InnodbIndexesRecord {
        this.tableId = value
        return this
    }

    override fun value4(value: Int?): InnodbIndexesRecord {
        this.type = value
        return this
    }

    override fun value5(value: Int?): InnodbIndexesRecord {
        this.nFields = value
        return this
    }

    override fun value6(value: Int?): InnodbIndexesRecord {
        this.pageNo = value
        return this
    }

    override fun value7(value: Int?): InnodbIndexesRecord {
        this.space = value
        return this
    }

    override fun value8(value: Int?): InnodbIndexesRecord {
        this.mergeThreshold = value
        return this
    }

    override fun values(value1: ULong?, value2: String?, value3: ULong?, value4: Int?, value5: Int?, value6: Int?, value7: Int?, value8: Int?): InnodbIndexesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised InnodbIndexesRecord
     */
    constructor(indexId: ULong? = null, name: String? = null, tableId: ULong? = null, type: Int? = null, nFields: Int? = null, pageNo: Int? = null, space: Int? = null, mergeThreshold: Int? = null): this() {
        this.indexId = indexId
        this.name = name
        this.tableId = tableId
        this.type = type
        this.nFields = nFields
        this.pageNo = pageNo
        this.space = space
        this.mergeThreshold = mergeThreshold
    }
}