/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables


import me.adibfarrasy.ktor.demo.generated.information_schema.InformationSchema
import me.adibfarrasy.ktor.demo.generated.information_schema.tables.records.InnodbBufferPoolStatsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbBufferPoolStats(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, InnodbBufferPoolStatsRecord>?,
    aliased: Table<InnodbBufferPoolStatsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<InnodbBufferPoolStatsRecord>(
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
         * <code>information_schema.INNODB_BUFFER_POOL_STATS</code>
         */
        val INNODB_BUFFER_POOL_STATS: InnodbBufferPoolStats = InnodbBufferPoolStats()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbBufferPoolStatsRecord> = InnodbBufferPoolStatsRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
     */
    val POOL_ID: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("POOL_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
     */
    val POOL_SIZE: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("POOL_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
     */
    val FREE_BUFFERS: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("FREE_BUFFERS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
     */
    val DATABASE_PAGES: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
     */
    val OLD_DATABASE_PAGES: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("OLD_DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
     */
    val MODIFIED_DATABASE_PAGES: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("MODIFIED_DATABASE_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
     */
    val PENDING_DECOMPRESS: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PENDING_DECOMPRESS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
     */
    val PENDING_READS: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PENDING_READS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
     */
    val PENDING_FLUSH_LRU: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PENDING_FLUSH_LRU"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
     */
    val PENDING_FLUSH_LIST: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PENDING_FLUSH_LIST"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
     */
    val PAGES_MADE_YOUNG: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PAGES_MADE_YOUNG"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
     */
    val PAGES_NOT_MADE_YOUNG: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("PAGES_NOT_MADE_YOUNG"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
     */
    val PAGES_MADE_YOUNG_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("PAGES_MADE_YOUNG_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
     */
    val PAGES_MADE_NOT_YOUNG_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("PAGES_MADE_NOT_YOUNG_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
     */
    val NUMBER_PAGES_READ: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_PAGES_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
     */
    val NUMBER_PAGES_CREATED: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_PAGES_CREATED"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
     */
    val NUMBER_PAGES_WRITTEN: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_PAGES_WRITTEN"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
     */
    val PAGES_READ_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("PAGES_READ_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
     */
    val PAGES_CREATE_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("PAGES_CREATE_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
     */
    val PAGES_WRITTEN_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("PAGES_WRITTEN_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
     */
    val NUMBER_PAGES_GET: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_PAGES_GET"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
     */
    val HIT_RATE: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("HIT_RATE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    val YOUNG_MAKE_PER_THOUSAND_GETS: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("YOUNG_MAKE_PER_THOUSAND_GETS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    val NOT_YOUNG_MAKE_PER_THOUSAND_GETS: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NOT_YOUNG_MAKE_PER_THOUSAND_GETS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
     */
    val NUMBER_PAGES_READ_AHEAD: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_PAGES_READ_AHEAD"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
     */
    val NUMBER_READ_AHEAD_EVICTED: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("NUMBER_READ_AHEAD_EVICTED"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
     */
    val READ_AHEAD_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("READ_AHEAD_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
     */
    val READ_AHEAD_EVICTED_RATE: TableField<InnodbBufferPoolStatsRecord, Double?> = createField(DSL.name("READ_AHEAD_EVICTED_RATE"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
     */
    val LRU_IO_TOTAL: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("LRU_IO_TOTAL"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
     */
    val LRU_IO_CURRENT: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("LRU_IO_CURRENT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
     */
    val UNCOMPRESS_TOTAL: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("UNCOMPRESS_TOTAL"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
     */
    val UNCOMPRESS_CURRENT: TableField<InnodbBufferPoolStatsRecord, ULong?> = createField(DSL.name("UNCOMPRESS_CURRENT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbBufferPoolStatsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<InnodbBufferPoolStatsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_BUFFER_POOL_STATS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, InnodbBufferPoolStatsRecord>): this(Internal.createPathAlias(child, key), child, key, INNODB_BUFFER_POOL_STATS, null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbBufferPoolStats = InnodbBufferPoolStats(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbBufferPoolStats = InnodbBufferPoolStats(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbBufferPoolStats = InnodbBufferPoolStats(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbBufferPoolStats = InnodbBufferPoolStats(name, null)
}