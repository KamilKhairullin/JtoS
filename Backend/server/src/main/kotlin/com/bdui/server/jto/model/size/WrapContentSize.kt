package com.bdui.server.jto.model.size

import com.bdui.server.jto.UiNamespace
import com.fasterxml.jackson.annotation.JsonUnwrapped

class WrapContentSize internal constructor(
    @JsonUnwrapped
    val properties: Properties
): Size {
    class Properties internal constructor(
        val type: String = "wrapContentSize",
        val maxSize: Int? = null,
        val minSize: Int? = null
    )
}

fun UiNamespace.wrapContentSize(
    maxSize: Int? = null,
    minSize: Int? = null
): WrapContentSize = WrapContentSize(
    WrapContentSize.Properties(
        maxSize = maxSize,
        minSize = minSize
    )
)