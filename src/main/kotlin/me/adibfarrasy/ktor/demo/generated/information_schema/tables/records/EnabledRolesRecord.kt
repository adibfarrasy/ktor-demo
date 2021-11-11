/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.information_schema.tables.records


import me.adibfarrasy.ktor.demo.generated.information_schema.tables.EnabledRoles

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EnabledRolesRecord() : TableRecordImpl<EnabledRolesRecord>(EnabledRoles.ENABLED_ROLES), Record4<String?, String?, String?, String?> {

    var roleName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var roleHost: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @set:JvmName("setIsDefault")
    var isDefault: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @set:JvmName("setIsMandatory")
    var isMandatory: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, String?, String?, String?> = super.fieldsRow() as Row4<String?, String?, String?, String?>
    override fun valuesRow(): Row4<String?, String?, String?, String?> = super.valuesRow() as Row4<String?, String?, String?, String?>
    override fun field1(): Field<String?> = EnabledRoles.ENABLED_ROLES.ROLE_NAME
    override fun field2(): Field<String?> = EnabledRoles.ENABLED_ROLES.ROLE_HOST
    override fun field3(): Field<String?> = EnabledRoles.ENABLED_ROLES.IS_DEFAULT
    override fun field4(): Field<String?> = EnabledRoles.ENABLED_ROLES.IS_MANDATORY
    override fun component1(): String? = roleName
    override fun component2(): String? = roleHost
    override fun component3(): String? = isDefault
    override fun component4(): String? = isMandatory
    override fun value1(): String? = roleName
    override fun value2(): String? = roleHost
    override fun value3(): String? = isDefault
    override fun value4(): String? = isMandatory

    override fun value1(value: String?): EnabledRolesRecord {
        this.roleName = value
        return this
    }

    override fun value2(value: String?): EnabledRolesRecord {
        this.roleHost = value
        return this
    }

    override fun value3(value: String?): EnabledRolesRecord {
        this.isDefault = value
        return this
    }

    override fun value4(value: String?): EnabledRolesRecord {
        this.isMandatory = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?): EnabledRolesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised EnabledRolesRecord
     */
    constructor(roleName: String? = null, roleHost: String? = null, isDefault: String? = null, isMandatory: String? = null): this() {
        this.roleName = roleName
        this.roleHost = roleHost
        this.isDefault = isDefault
        this.isMandatory = isMandatory
    }
}