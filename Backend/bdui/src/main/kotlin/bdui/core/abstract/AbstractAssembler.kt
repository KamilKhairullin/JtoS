package org.example.bdui.core.abstract

abstract class AbstractAssembler {

    abstract fun getName(): String
    abstract fun convert(section: AbstractSection)
}