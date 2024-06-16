package com.bdui.server.bdui.businessLogic

import com.bdui.server.bdui.core.abstract.AbstractScreenBuilder
import com.bdui.server.bdui.core.abstract.AbstractSection
import com.bdui.server.bdui.core.model.ScreenTemplate

fun AbstractScreenBuilder.screen(bulder: ScreenContext.() -> Unit): ScreenTemplate {
    return ScreenContext().apply(bulder).toScreenTemplate()
}

class ScreenContext {
    private var sections: List<AbstractSection> = emptyList()
    fun sections(builder: SectionContext.() -> Unit) {
        sections = SectionContext(mutableListOf()).apply(builder)
    }

    fun toScreenTemplate(): ScreenTemplate {
        return ScreenTemplate(
            sections = sections
        )
    }
}