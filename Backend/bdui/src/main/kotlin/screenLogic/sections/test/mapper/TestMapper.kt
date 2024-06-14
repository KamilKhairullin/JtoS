package org.example.screenLogic.sections.test.mapper

import org.example.screenLogic.sections.test.context.TestRenderContext

object TestMapper {

    fun map(): TestRenderContext {
        return TestRenderContext(
            text = "Aboba 123"
        )
    }
}