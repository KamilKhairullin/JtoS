package com.bdui.server.jto.model.size

import com.bdui.server.jto.UiNamespace
import com.fasterxml.jackson.annotation.JsonUnwrapped

class FixedSize internal constructor(
    @JsonUnwrapped
    val properties: Properties
): Size {
    class Properties internal constructor(
        val value: Int
    )
}

fun UiNamespace.fixedSize(
    value: Int
): FixedSize = FixedSize(
    FixedSize.Properties(
        value = value
    )
)