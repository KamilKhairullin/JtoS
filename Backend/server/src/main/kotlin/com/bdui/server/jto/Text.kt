package com.bdui.server.jto

import com.bdui.server.jto.model.ContentMode
import com.bdui.server.jto.model.insets.EdgeInsets
import com.bdui.server.jto.model.size.Size
import com.fasterxml.jackson.annotation.JsonUnwrapped
import java.awt.Color

class Text internal constructor(
    @JsonUnwrapped
    val properties: Properties
) : Div {
    override val type: String
        get() = "text"
    class Properties internal constructor(
        val text: String,
        val width: Size,
        val height: Size,
        val padding: EdgeInsets,
        val fontSize: Int
    )
}

fun UiNamespace.text(
    text: String,
    width: Size,
    height: Size,
    padding: EdgeInsets,
    fontSize: Int
): Text = Text(
    Text.Properties(
        text = text,
        width = width,
        height = height,
        padding = padding,
        fontSize = fontSize
    )
)