package org.example.bdui.core.resolver

import kotlinx.coroutines.Deferred

abstract class Resolver {
    abstract suspend fun resolve(): Deferred<Any?>
}