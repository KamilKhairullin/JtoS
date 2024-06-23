package com.bdui.server.jto.model.size

import com.bdui.server.jto.UiNamespace
import com.fasterxml.jackson.annotation.JsonUnwrapped

class WrapContentSize internal constructor(
    @JsonUnwrapped
    val properties: Properties
){
    class Properties internal constructor(
        val maxSize: FixedSize? = null,
        val minSize: FixedSize? = null
    )
}

fun UiNamespace.wrapContentSize(
    maxSize: FixedSize? = null,
    minSize: FixedSize? = null
): WrapContentSize = WrapContentSize(
    WrapContentSize.Properties(
        maxSize = maxSize,
        minSize = minSize
    )
)