package com.bdui.server.screenLogic.sections.test

import com.bdui.server.bdui.core.abstract.AbstractAssembler
import com.bdui.server.bdui.core.abstract.AbstractSection
import com.bdui.server.bdui.core.model.Snippet
import com.bdui.server.bdui.core.model.SnippetFactory
import com.bdui.server.screenLogic.sections.test.mapper.TestMapper
import com.bdui.server.screenLogic.sections.test.renderer.TestRenderer

class TestAssembler(): AbstractAssembler() {
    override fun getName(): String {
        return "TestAssembler"
    }

    override fun convert(section: AbstractSection): List<Snippet> {
        println(section.resolverRespone)
        val renderContext = TestMapper.map()
        val render = TestRenderer.render(renderContext)
        return listOf(SnippetFactory.createSnippet(0, render))
    }
}