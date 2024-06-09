package org.example.bdui.core.abstract

import org.example.bdui.core.model.ScreenTemplate

abstract class AbstractScreenBuilder {
    open val pageType: String? = null

    abstract fun build(): ScreenTemplate
}