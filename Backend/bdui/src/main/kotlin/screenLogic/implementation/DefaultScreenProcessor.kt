package org.example.screenLogic.implementation

import org.example.bdui.core.abstract.AbstractScreenProcessor
import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse
import org.example.bdui.engine.ScreenEngine
import org.springframework.stereotype.Service

@Service
class DefaultScreenProcessor (
    private val engine: ScreenEngine
) : AbstractScreenProcessor {

    override fun getScreen(request: ScreenRequest): ScreenResponse {
        val response = engine.processScreen(
            request = request
        )
        return response
    }
}