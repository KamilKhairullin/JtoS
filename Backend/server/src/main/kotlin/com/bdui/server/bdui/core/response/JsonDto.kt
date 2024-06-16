package com.bdui.server.bdui.core.response

sealed class JsonDto {
    var type: String = buildType(javaClass)

    // recursive ui to render inside
    var ui: JsonDto? = null
    companion object {
        fun buildType(javaClass: Class<*>): String {
            return javaClass.simpleName
        }
    }
}