package org.example.screenLogic.sections.test

import org.example.bdui.core.abstract.AbstractAssembler
import org.example.bdui.core.abstract.AbstractSection
import org.example.screenLogic.sections.test.mapper.TestMapper
import org.example.screenLogic.sections.test.renderer.TestRenderer

class TestAssembler: AbstractAssembler() {
    override fun getName(): String {
        return "TestAssembler"
    }

    override fun convert(section: AbstractSection) {
        println(section.resolverRespone)
        val renderContext = TestMapper.map()
        val render = TestRenderer.render(renderContext)
    }
}