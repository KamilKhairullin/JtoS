package org.example.bdui.core.model

import org.example.bdui.core.abstract.AbstractScreenBuilder

class ScreenRequest (
    val screenId: String? = null,
    var screenBuilder: AbstractScreenBuilder? = null
) {
    fun buildScreenTemplate(): ScreenTemplate {
        return screenBuilder?.build() ?: throw IllegalArgumentException("No screen template to build")
    }
}