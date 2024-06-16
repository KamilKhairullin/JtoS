package com.bdui.server.jto.model

import com.bdui.server.jto.UiNamespace

class FixedSize internal constructor(
    properties: Properties
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