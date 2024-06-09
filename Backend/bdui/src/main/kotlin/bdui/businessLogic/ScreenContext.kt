package org.example.bdui.businessLogic

import org.example.bdui.core.abstract.AbstractScreenBuilder
import org.example.bdui.core.abstract.AbstractSection
import org.example.bdui.core.model.ScreenTemplate

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