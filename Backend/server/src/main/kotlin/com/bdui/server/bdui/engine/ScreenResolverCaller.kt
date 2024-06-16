package com.bdui.server.bdui.engine

import com.bdui.server.bdui.core.resolver.Resolver
import org.springframework.stereotype.Service

@Service
class ScreenResolverCaller() {

    suspend fun callResolver(resolver: Resolver?): Any? {
        return resolver?.resolve()?.await()
    }
}