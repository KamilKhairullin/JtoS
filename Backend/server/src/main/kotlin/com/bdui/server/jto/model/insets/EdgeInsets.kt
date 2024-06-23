package com.bdui.server.jto.model.insets

import com.bdui.server.jto.UiNamespace
import com.fasterxml.jackson.annotation.JsonUnwrapped

class EdgeInsets internal constructor(
    @JsonUnwrapped
    val properties: Properties
){
    class Properties internal constructor(
        val bottom: Int?,
        val left: Int?,
        val top: Int?,
        val right: Int?
    )
}

fun UiNamespace.edgeInsets(
    bottom: Int? = null,
    left: Int? = null,
    top: Int? = null,
    right: Int? = null,
): EdgeInsets = EdgeInsets(
    EdgeInsets.Properties(
        bottom = bottom,
        left = left,
        top = top,
        right = right,
    )
)