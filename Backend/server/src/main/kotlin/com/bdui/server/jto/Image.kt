package com.bdui.server.jto

import com.bdui.server.jto.model.ContentMode
import com.bdui.server.jto.model.size.Size
import com.bdui.server.jto.model.Url
import com.bdui.server.jto.model.insets.EdgeInsets
import com.fasterxml.jackson.annotation.JsonUnwrapped

class Image internal constructor(
    @JsonUnwrapped
    val properties: Properties
) : Div {
    override val type: String
        get() = "image"
    class Properties internal constructor(
        val imageUrl: Url?,
        val contentMode: ContentMode,
        val width: Size,
        val height: Size,
        val padding: EdgeInsets
    )

}

fun UiNamespace.image(
    imageUrl: Url?,
    contentMode: ContentMode,
    width: Size,
    height: Size,
    padding: EdgeInsets,
): Image = Image(
    Image.Properties(
        imageUrl = imageUrl,
        contentMode = contentMode,
        width = width,
        height = height,
        padding = padding,
    )
)
