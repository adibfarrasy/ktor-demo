/*
 * This file is generated by jOOQ.
 */
package me.adibfarrasy.ktor.demo.generated.pojo.todo_db


import me.adibfarrasy.ktor.demo.generated.pojo.DefaultCatalog

import org.jooq.Catalog
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TodoDb : SchemaImpl("todo_db", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>todo_db</code>
         */
        val TODO_DB: TodoDb = TodoDb()
    }

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG
}
