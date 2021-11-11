/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.InnodbFtDefaultStopword

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbFtDefaultStopwordRecord() : TableRecordImpl<InnodbFtDefaultStopwordRecord>(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD), Record1<String?> {

    var value: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row1<String?> = super.fieldsRow() as Row1<String?>
    override fun valuesRow(): Row1<String?> = super.valuesRow() as Row1<String?>
    override fun field1(): Field<String?> = InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD.VALUE
    override fun component1(): String? = value
    override fun value1(): String? = value

    override fun value1(value: String?): InnodbFtDefaultStopwordRecord {
        this.value = value
        return this
    }

    override fun values(value1: String?): InnodbFtDefaultStopwordRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised InnodbFtDefaultStopwordRecord
     */
    constructor(value: String? = null): this() {
        this.value = value
    }
}
