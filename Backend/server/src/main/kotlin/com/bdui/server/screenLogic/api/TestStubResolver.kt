package com.bdui.server.screenLogic.api

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import com.bdui.server.bdui.core.resolver.Resolver

class TestStubResolver: Resolver() {
    override suspend fun resolve(): Deferred<Any?> = coroutineScope {
        async {
            ""
        }
    }
}