package org.example.bdui.engine

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse
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