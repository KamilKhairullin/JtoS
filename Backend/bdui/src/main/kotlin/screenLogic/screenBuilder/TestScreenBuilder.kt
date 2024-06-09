package org.example.screenLogic.screenBuilder

import org.example.bdui.businessLogic.screen
import org.example.bdui.core.abstract.AbstractScreenBuilder
import org.example.screenLogic.api.TestResolver
import org.example.screenLogic.sections.test.TestSection

class TestScreenBuilder: AbstractScreenBuilder() {
    override fun build() = screen {
        sections {
            section<TestSection> {
                id = TestSection.NAME
                resolver = TestResolver()
                assemblerType = "TestAssembler"
            }
            section<TestSection> {
                id = TestSection.NAME
                resolver = TestResolver()
                assemblerType = "TestAssembler"
            }
            section<TestSection> {
                id = TestSection.NAME
                resolver = TestResolver()
                assemblerType = "TestAssembler"
            }
        }
    }
}