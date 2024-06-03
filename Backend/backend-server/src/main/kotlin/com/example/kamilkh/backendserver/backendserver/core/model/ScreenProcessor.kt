package com.example.kamilkh.backendserver.backendserver.core.model

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenProcessor
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.engine.ScreenEngine
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class ScreenProcessor(
    private val screenEngine: ScreenEngine
) : AbstractScreenProcessor {

    override fun getScreen(request: ScreenRequest): ScreenResponse {
        return screenEngine.processScreen()
    }
}
