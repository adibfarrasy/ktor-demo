/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.ViewTableUsage

import org.jooq.Field
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ViewTableUsageRecord() : TableRecordImpl<ViewTableUsageRecord>(ViewTableUsage.VIEW_TABLE_USAGE), Record6<String?, String?, String?, String?, String?, String?> {

    var viewCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var viewSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var viewName: String?
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

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row6<String?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row6<String?, String?, String?, String?, String?, String?> = super.valuesRow() as Row6<String?, String?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.VIEW_CATALOG
    override fun field2(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.VIEW_SCHEMA
    override fun field3(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.VIEW_NAME
    override fun field4(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.TABLE_CATALOG
    override fun field5(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.TABLE_SCHEMA
    override fun field6(): Field<String?> = ViewTableUsage.VIEW_TABLE_USAGE.TABLE_NAME
    override fun component1(): String? = viewCatalog
    override fun component2(): String? = viewSchema
    override fun component3(): String? = viewName
    override fun component4(): String? = tableCatalog
    override fun component5(): String? = tableSchema
    override fun component6(): String? = tableName
    override fun value1(): String? = viewCatalog
    override fun value2(): String? = viewSchema
    override fun value3(): String? = viewName
    override fun value4(): String? = tableCatalog
    override fun value5(): String? = tableSchema
    override fun value6(): String? = tableName

    override fun value1(value: String?): ViewTableUsageRecord {
        this.viewCatalog = value
        return this
    }

    override fun value2(value: String?): ViewTableUsageRecord {
        this.viewSchema = value
        return this
    }

    override fun value3(value: String?): ViewTableUsageRecord {
        this.viewName = value
        return this
    }

    override fun value4(value: String?): ViewTableUsageRecord {
        this.tableCatalog = value
        return this
    }

    override fun value5(value: String?): ViewTableUsageRecord {
        this.tableSchema = value
        return this
    }

    override fun value6(value: String?): ViewTableUsageRecord {
        this.tableName = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?): ViewTableUsageRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised ViewTableUsageRecord
     */
    constructor(viewCatalog: String? = null, viewSchema: String? = null, viewName: String? = null, tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null): this() {
        this.viewCatalog = viewCatalog
        this.viewSchema = viewSchema
        this.viewName = viewName
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
    }
}
