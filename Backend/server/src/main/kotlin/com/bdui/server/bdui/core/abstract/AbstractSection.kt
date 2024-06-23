package com.bdui.server.bdui.core.abstract

import com.bdui.server.bdui.core.model.SectionResponse
import com.bdui.server.bdui.core.resolver.Resolver
import com.bdui.server.jto.View

abstract class AbstractSection {
    lateinit var id: String
    var assemblerType: String? = null
    var resolver: Resolver? = null
    var resolverRespone: Any? = null
    var views: List<View> = emptyList()
}

fun List<AbstractSection>.toSectionResponses(): List<SectionResponse> {
    return this.map { SectionResponse(
        id = it.id,
        views = it.views
    )}
}