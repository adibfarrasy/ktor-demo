/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.OptimizerTrace

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class OptimizerTraceRecord() : TableRecordImpl<OptimizerTraceRecord>(OptimizerTrace.OPTIMIZER_TRACE), Record4<String?, String?, Int?, Byte?> {

    var query: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var trace: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var missingBytesBeyondMaxMemSize: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    var insufficientPrivileges: Byte?
        set(value): Unit = set(3, value)
        get(): Byte? = get(3) as Byte?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, String?, Int?, Byte?> = super.fieldsRow() as Row4<String?, String?, Int?, Byte?>
    override fun valuesRow(): Row4<String?, String?, Int?, Byte?> = super.valuesRow() as Row4<String?, String?, Int?, Byte?>
    override fun field1(): Field<String?> = OptimizerTrace.OPTIMIZER_TRACE.QUERY
    override fun field2(): Field<String?> = OptimizerTrace.OPTIMIZER_TRACE.TRACE
    override fun field3(): Field<Int?> = OptimizerTrace.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
    override fun field4(): Field<Byte?> = OptimizerTrace.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
    override fun component1(): String? = query
    override fun component2(): String? = trace
    override fun component3(): Int? = missingBytesBeyondMaxMemSize
    override fun component4(): Byte? = insufficientPrivileges
    override fun value1(): String? = query
    override fun value2(): String? = trace
    override fun value3(): Int? = missingBytesBeyondMaxMemSize
    override fun value4(): Byte? = insufficientPrivileges

    override fun value1(value: String?): OptimizerTraceRecord {
        this.query = value
        return this
    }

    override fun value2(value: String?): OptimizerTraceRecord {
        this.trace = value
        return this
    }

    override fun value3(value: Int?): OptimizerTraceRecord {
        this.missingBytesBeyondMaxMemSize = value
        return this
    }

    override fun value4(value: Byte?): OptimizerTraceRecord {
        this.insufficientPrivileges = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Int?, value4: Byte?): OptimizerTraceRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised OptimizerTraceRecord
     */
    constructor(query: String? = null, trace: String? = null, missingBytesBeyondMaxMemSize: Int? = null, insufficientPrivileges: Byte? = null): this() {
        this.query = query
        this.trace = trace
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize
        this.insufficientPrivileges = insufficientPrivileges
    }
}