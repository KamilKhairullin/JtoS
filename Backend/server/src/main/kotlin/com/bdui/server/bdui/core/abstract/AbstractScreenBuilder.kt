package com.bdui.server.bdui.core.abstract

import com.bdui.server.bdui.core.model.ScreenTemplate

abstract class AbstractScreenBuilder {
    open val pageType: String? = null

    abstract fun build(): ScreenTemplate
}