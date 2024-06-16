package com.bdui.server.screenLogic.implementation

import com.bdui.server.bdui.core.abstract.AbstractScreenProcessor
import com.bdui.server.bdui.core.model.ScreenRequest
import com.bdui.server.bdui.core.model.ScreenResponse
import com.bdui.server.bdui.engine.ScreenEngine
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