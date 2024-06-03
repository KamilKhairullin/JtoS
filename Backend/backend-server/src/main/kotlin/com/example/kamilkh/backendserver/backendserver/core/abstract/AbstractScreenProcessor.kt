package com.example.kamilkh.backendserver.backendserver.core.abstract

interface AbstractScreenProcessor {
    fun getScreen(request: ScreenRequest): ScreenResponse
}
