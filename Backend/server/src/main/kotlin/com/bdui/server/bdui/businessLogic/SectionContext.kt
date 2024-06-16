package com.bdui.server.bdui.businessLogic

import com.bdui.server.bdui.core.abstract.AbstractSection
import java.util.UUID

class SectionContext(
    private val list: MutableList<AbstractSection>
) : MutableList<AbstractSection> by list {

    inline fun <reified S: AbstractSection> section(builder: (S).() -> Unit) {
        val section = S::class
        val constructor = section.constructors.first()
        val instance = constructor.call()
        add(
            instance.apply {
                id = UUID.randomUUID().toString()
                builder()
            }
        )
    }
}