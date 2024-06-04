package com.example.kamilkh.backendserver.backendserver.core.abstract

import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest

interface AbstractScreenProcessor {
    fun getScreen(request: ScreenRequest): ScreenResponse
}
