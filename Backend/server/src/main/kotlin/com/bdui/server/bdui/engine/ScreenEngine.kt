package com.bdui.server.bdui.engine

import com.bdui.server.bdui.core.model.ScreenRequest
import com.bdui.server.bdui.core.model.ScreenResponse
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class ScreenEngine(
    private val screenResponseCreator: ScreenResponseCreator
) {
    fun processScreen(
        request: ScreenRequest
    ) : ScreenResponse {
        return screenResponseCreator.create(request)
    }
}