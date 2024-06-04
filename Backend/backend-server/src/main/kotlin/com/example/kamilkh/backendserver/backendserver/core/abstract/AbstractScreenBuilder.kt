package com.example.kamilkh.backendserver.backendserver.core.abstract

abstract class AbstractScreenBuilder {
    open val pageType: String? = null

    abstract fun build(): ScreenResponse
}