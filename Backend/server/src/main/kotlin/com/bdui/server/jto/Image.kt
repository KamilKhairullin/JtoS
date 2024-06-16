package com.bdui.server.jto

import com.bdui.server.jto.model.ContentMode
import com.bdui.server.jto.model.Size
import com.bdui.server.jto.model.Url

class Image internal constructor(
    val properties: Properties
) : UiElement {
    class Properties internal constructor(
        val imageUrl: Url?,
        val contentMode: ContentMode,
        val width: Size,
        val height: Size
    )
}

fun UiNamespace.image(
    imageUrl: Url?,
    contentMode: ContentMode,
    width: Size,
    height: Size
): Image = Image(
    Image.Properties(
        imageUrl = imageUrl,
        contentMode = contentMode,
        width = width,
        height = height
    )
)