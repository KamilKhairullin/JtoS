package com.example.kamilkh.backendserver.backendserver.implementation

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenProcessor
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.engine.ScreenEngine
import org.springframework.stereotype.Service

@Service
class DefaultScreenProcessor (
    private val engine: ScreenEngine
) : AbstractScreenProcessor {

    override fun getScreen(request: ScreenRequest): ScreenResponse {
        val response = engine.processScreen(
            request = request,
            screenGenerator = { buildScreenTemplate(request) }
        )
        return response
    }

    private fun buildScreenTemplate(request: ScreenRequest): ScreenResponse {
        val screenBuilder = request.screenBuilder
        return when {
            screenBuilder != null -> {
                screenBuilder.build()
            }
            else -> throw IllegalArgumentException("No screen template to build")
        }
    }
}