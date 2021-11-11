/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.InnodbBufferPoolStats

import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbBufferPoolStatsRecord() : TableRecordImpl<InnodbBufferPoolStatsRecord>(InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS) {

    var poolId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    var poolSize: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    var freeBuffers: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    var databasePages: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    var oldDatabasePages: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    var modifiedDatabasePages: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    var pendingDecompress: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    var pendingReads: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    var pendingFlushLru: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    var pendingFlushList: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    var pagesMadeYoung: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    var pagesNotMadeYoung: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    var pagesMadeYoungRate: Double?
        set(value): Unit = set(12, value)
        get(): Double? = get(12) as Double?

    var pagesMadeNotYoungRate: Double?
        set(value): Unit = set(13, value)
        get(): Double? = get(13) as Double?

    var numberPagesRead: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    var numberPagesCreated: ULong?
        set(value): Unit = set(15, value)
        get(): ULong? = get(15) as ULong?

    var numberPagesWritten: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    var pagesReadRate: Double?
        set(value): Unit = set(17, value)
        get(): Double? = get(17) as Double?

    var pagesCreateRate: Double?
        set(value): Unit = set(18, value)
        get(): Double? = get(18) as Double?

    var pagesWrittenRate: Double?
        set(value): Unit = set(19, value)
        get(): Double? = get(19) as Double?

    var numberPagesGet: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    var hitRate: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    var youngMakePerThousandGets: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    var notYoungMakePerThousandGets: ULong?
        set(value): Unit = set(23, value)
        get(): ULong? = get(23) as ULong?

    var numberPagesReadAhead: ULong?
        set(value): Unit = set(24, value)
        get(): ULong? = get(24) as ULong?

    var numberReadAheadEvicted: ULong?
        set(value): Unit = set(25, value)
        get(): ULong? = get(25) as ULong?

    var readAheadRate: Double?
        set(value): Unit = set(26, value)
        get(): Double? = get(26) as Double?

    var readAheadEvictedRate: Double?
        set(value): Unit = set(27, value)
        get(): Double? = get(27) as Double?

    var lruIoTotal: ULong?
        set(value): Unit = set(28, value)
        get(): ULong? = get(28) as ULong?

    var lruIoCurrent: ULong?
        set(value): Unit = set(29, value)
        get(): ULong? = get(29) as ULong?

    var uncompressTotal: ULong?
        set(value): Unit = set(30, value)
        get(): ULong? = get(30) as ULong?

    var uncompressCurrent: ULong?
        set(value): Unit = set(31, value)
        get(): ULong? = get(31) as ULong?

    /**
     * Create a detached, initialised InnodbBufferPoolStatsRecord
     */
    constructor(poolId: ULong? = null, poolSize: ULong? = null, freeBuffers: ULong? = null, databasePages: ULong? = null, oldDatabasePages: ULong? = null, modifiedDatabasePages: ULong? = null, pendingDecompress: ULong? = null, pendingReads: ULong? = null, pendingFlushLru: ULong? = null, pendingFlushList: ULong? = null, pagesMadeYoung: ULong? = null, pagesNotMadeYoung: ULong? = null, pagesMadeYoungRate: Double? = null, pagesMadeNotYoungRate: Double? = null, numberPagesRead: ULong? = null, numberPagesCreated: ULong? = null, numberPagesWritten: ULong? = null, pagesReadRate: Double? = null, pagesCreateRate: Double? = null, pagesWrittenRate: Double? = null, numberPagesGet: ULong? = null, hitRate: ULong? = null, youngMakePerThousandGets: ULong? = null, notYoungMakePerThousandGets: ULong? = null, numberPagesReadAhead: ULong? = null, numberReadAheadEvicted: ULong? = null, readAheadRate: Double? = null, readAheadEvictedRate: Double? = null, lruIoTotal: ULong? = null, lruIoCurrent: ULong? = null, uncompressTotal: ULong? = null, uncompressCurrent: ULong? = null): this() {
        this.poolId = poolId
        this.poolSize = poolSize
        this.freeBuffers = freeBuffers
        this.databasePages = databasePages
        this.oldDatabasePages = oldDatabasePages
        this.modifiedDatabasePages = modifiedDatabasePages
        this.pendingDecompress = pendingDecompress
        this.pendingReads = pendingReads
        this.pendingFlushLru = pendingFlushLru
        this.pendingFlushList = pendingFlushList
        this.pagesMadeYoung = pagesMadeYoung
        this.pagesNotMadeYoung = pagesNotMadeYoung
        this.pagesMadeYoungRate = pagesMadeYoungRate
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate
        this.numberPagesRead = numberPagesRead
        this.numberPagesCreated = numberPagesCreated
        this.numberPagesWritten = numberPagesWritten
        this.pagesReadRate = pagesReadRate
        this.pagesCreateRate = pagesCreateRate
        this.pagesWrittenRate = pagesWrittenRate
        this.numberPagesGet = numberPagesGet
        this.hitRate = hitRate
        this.youngMakePerThousandGets = youngMakePerThousandGets
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets
        this.numberPagesReadAhead = numberPagesReadAhead
        this.numberReadAheadEvicted = numberReadAheadEvicted
        this.readAheadRate = readAheadRate
        this.readAheadEvictedRate = readAheadEvictedRate
        this.lruIoTotal = lruIoTotal
        this.lruIoCurrent = lruIoCurrent
        this.uncompressTotal = uncompressTotal
        this.uncompressCurrent = uncompressCurrent
    }
}
