/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.InnodbCmpPerIndex

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbCmpPerIndexRecord() : TableRecordImpl<InnodbCmpPerIndexRecord>(InnodbCmpPerIndex.INNODB_CMP_PER_INDEX), Record8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> {

    var databaseName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var indexName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var compressOps: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    var compressOpsOk: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    var compressTime: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    var uncompressOps: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    var uncompressTime: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?>
    override fun valuesRow(): Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> = super.valuesRow() as Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?>
    override fun field1(): Field<String?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.DATABASE_NAME
    override fun field2(): Field<String?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.TABLE_NAME
    override fun field3(): Field<String?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.INDEX_NAME
    override fun field4(): Field<Int?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_OPS
    override fun field5(): Field<Int?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_OPS_OK
    override fun field6(): Field<Int?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_TIME
    override fun field7(): Field<Int?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.UNCOMPRESS_OPS
    override fun field8(): Field<Int?> = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.UNCOMPRESS_TIME
    override fun component1(): String? = databaseName
    override fun component2(): String? = tableName
    override fun component3(): String? = indexName
    override fun component4(): Int? = compressOps
    override fun component5(): Int? = compressOpsOk
    override fun component6(): Int? = compressTime
    override fun component7(): Int? = uncompressOps
    override fun component8(): Int? = uncompressTime
    override fun value1(): String? = databaseName
    override fun value2(): String? = tableName
    override fun value3(): String? = indexName
    override fun value4(): Int? = compressOps
    override fun value5(): Int? = compressOpsOk
    override fun value6(): Int? = compressTime
    override fun value7(): Int? = uncompressOps
    override fun value8(): Int? = uncompressTime

    override fun value1(value: String?): InnodbCmpPerIndexRecord {
        this.databaseName = value
        return this
    }

    override fun value2(value: String?): InnodbCmpPerIndexRecord {
        this.tableName = value
        return this
    }

    override fun value3(value: String?): InnodbCmpPerIndexRecord {
        this.indexName = value
        return this
    }

    override fun value4(value: Int?): InnodbCmpPerIndexRecord {
        this.compressOps = value
        return this
    }

    override fun value5(value: Int?): InnodbCmpPerIndexRecord {
        this.compressOpsOk = value
        return this
    }

    override fun value6(value: Int?): InnodbCmpPerIndexRecord {
        this.compressTime = value
        return this
    }

    override fun value7(value: Int?): InnodbCmpPerIndexRecord {
        this.uncompressOps = value
        return this
    }

    override fun value8(value: Int?): InnodbCmpPerIndexRecord {
        this.uncompressTime = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: Int?, value5: Int?, value6: Int?, value7: Int?, value8: Int?): InnodbCmpPerIndexRecord {
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
     * Create a detached, initialised InnodbCmpPerIndexRecord
     */
    constructor(databaseName: String? = null, tableName: String? = null, indexName: String? = null, compressOps: Int? = null, compressOpsOk: Int? = null, compressTime: Int? = null, uncompressOps: Int? = null, uncompressTime: Int? = null): this() {
        this.databaseName = databaseName
        this.tableName = tableName
        this.indexName = indexName
        this.compressOps = compressOps
        this.compressOpsOk = compressOpsOk
        this.compressTime = compressTime
        this.uncompressOps = uncompressOps
        this.uncompressTime = uncompressTime
    }
}