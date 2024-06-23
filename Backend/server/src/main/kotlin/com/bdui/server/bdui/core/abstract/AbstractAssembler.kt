package com.bdui.server.bdui.core.abstract

import com.bdui.server.jto.View

abstract class AbstractAssembler {

    abstract fun getName(): String
    abstract fun convert(section: AbstractSection): List<View>
}