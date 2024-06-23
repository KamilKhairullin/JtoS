package com.bdui.server.jto

import ColorRGB
import com.bdui.server.jto.model.Orientation
import com.bdui.server.jto.model.insets.EdgeInsets
import com.bdui.server.jto.model.size.Size
import com.fasterxml.jackson.annotation.JsonUnwrapped

class Container internal constructor(
    @JsonUnwrapped
    val properties: Properties
): Div {
    override val type: String
        get() = "container"
    class Properties internal constructor(
        val width: Size,
        val height: Size,
        val padding: EdgeInsets,
        val items: List<Div>,
        val orientation: Orientation,
        val backgroundColor: ColorRGB,
        val cornerRadius: Int
    )
}

fun UiNamespace.container(
    width: Size,
    height: Size,
    padding: EdgeInsets,
    items: List<Div>,
    orientation: Orientation,
    backgroundColor: ColorRGB,
    cornerRadius: Int = 0
): Container = Container(
    Container.Properties(
        width = width,
        height = height,
        padding = padding,
        items = items,
        orientation = orientation,
        backgroundColor = backgroundColor,
        cornerRadius = cornerRadius
    )
)