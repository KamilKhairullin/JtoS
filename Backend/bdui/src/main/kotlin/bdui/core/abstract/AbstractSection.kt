package org.example.bdui.core.abstract

import org.example.bdui.core.resolver.Resolver

abstract class AbstractSection {
    lateinit var id: String
    var assemblerType: String? = null
    var resolver: Resolver? = null
    var resolverRespone: Any? = null
}