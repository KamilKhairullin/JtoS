package com.example.kamilkh.backendserver.backendserver.core.abstract

abstract class AbstractAction {
    val realType = buildType()
    private fun buildType(): String {
        return javaClass.simpleName
    }
}