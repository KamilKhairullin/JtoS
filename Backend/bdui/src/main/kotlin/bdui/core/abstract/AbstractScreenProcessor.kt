package org.example.bdui.core.abstract

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse

interface AbstractScreenProcessor {
    fun getScreen(request: ScreenRequest): ScreenResponse
}
