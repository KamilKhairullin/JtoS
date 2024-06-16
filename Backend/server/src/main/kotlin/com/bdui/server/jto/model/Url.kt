package com.bdui.server.jto.model

import com.bdui.server.jto.UiNamespace

@JvmInline
value class Url internal constructor(
    private val value: String
) {
    override fun toString() = value

    companion object {
        fun create(url: String): Url = Url(url)
    }
}

fun UiNamespace.url(url: String): Url = Url(url)