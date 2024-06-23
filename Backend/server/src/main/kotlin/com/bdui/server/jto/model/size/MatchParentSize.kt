package com.bdui.server.jto.model.size

import com.bdui.server.jto.UiNamespace
import com.fasterxml.jackson.annotation.JsonUnwrapped

class MatchParentSize internal constructor(
    @JsonUnwrapped
    val properties: Properties
): Size {
    class Properties internal constructor(
        val type: String = "matchParentSize",
        val weight: Double = 0.0
    )
}

fun UiNamespace.matchParentSize(
    weight: Double = 0.0
): MatchParentSize = MatchParentSize(
    MatchParentSize.Properties(
        weight = weight
    )
)
