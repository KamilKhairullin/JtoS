package com.bdui.server.bdui.core.abstract

abstract class AbstractAction {
    val realType = buildType()
    private fun buildType(): String {
        return javaClass.simpleName
    }
}