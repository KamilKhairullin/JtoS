package org.example.bdui.engine

import org.example.bdui.core.resolver.Resolver
import org.springframework.stereotype.Service

@Service
class ScreenResolverCaller() {

    suspend fun callResolver(resolver: Resolver?): Any? {
        return resolver?.resolve()?.await()
    }
}