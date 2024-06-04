package com.example.kamilkh.backendserver.backendserver.controller

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractAction
import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenBuilder
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse

class TestScreenBuilder: AbstractScreenBuilder() {
    override fun build(): ScreenResponse {
        return ScreenResponse(
            sections = emptyList()
        )
    }
}