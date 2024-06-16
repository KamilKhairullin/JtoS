package com.bdui.server.bdui.core.abstract

import com.bdui.server.bdui.core.model.Snippet

abstract class AbstractAssembler {

    abstract fun getName(): String
    abstract fun convert(section: AbstractSection): List<Snippet>
}