package com.bdui.server.screenLogic.screenBuilder

import com.bdui.server.bdui.businessLogic.screen
import com.bdui.server.bdui.core.abstract.AbstractScreenBuilder
import com.bdui.server.screenLogic.api.TestStubResolver
import com.bdui.server.screenLogic.sections.test.TestSection

class TestScreenBuilder: AbstractScreenBuilder() {
    override fun build() = screen {
        sections {
            section<TestSection> {
                id = "${TestSection.NAME}-1"
                resolver = TestStubResolver()
                assemblerType = "TestAssembler"
            }
        }
    }
}
