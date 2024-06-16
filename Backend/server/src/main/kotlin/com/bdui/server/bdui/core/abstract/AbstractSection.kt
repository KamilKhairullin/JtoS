package com.bdui.server.bdui.core.abstract

import com.bdui.server.bdui.core.model.Snippet
import com.bdui.server.bdui.core.resolver.Resolver

abstract class AbstractSection {
    lateinit var id: String
    var assemblerType: String? = null
    var resolver: Resolver? = null
    var resolverRespone: Any? = null
    var snippets: List<Snippet> = emptyList()
}