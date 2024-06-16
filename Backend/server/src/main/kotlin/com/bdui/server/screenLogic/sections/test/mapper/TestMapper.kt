package com.bdui.server.screenLogic.sections.test.mapper

import com.bdui.server.screenLogic.sections.test.context.TestRenderContext

object TestMapper {

    fun map(): TestRenderContext {
        return TestRenderContext(
            text = "Aboba 123"
        )
    }
}