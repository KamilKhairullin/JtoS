package com.bdui.server.jto

import ColorRGB
import color
import com.bdui.server.jto.model.Orientation
import com.bdui.server.jto.model.insets.EdgeInsets
import com.bdui.server.jto.model.size.Size
import com.fasterxml.jackson.annotation.JsonUnwrapped
import java.awt.Color
import java.util.UUID

class Container internal constructor(
    @JsonUnwrapped
    val properties: Properties
): Div {
    override val type: String
        get() = "container"
    override val id: String
        get() = UUID.randomUUID().toString()
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
    backgroundColor: ColorRGB = color(Color.white),
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