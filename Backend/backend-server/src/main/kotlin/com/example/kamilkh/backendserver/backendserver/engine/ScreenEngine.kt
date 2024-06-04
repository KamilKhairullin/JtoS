package com.example.kamilkh.backendserver.backendserver.engine

import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequestBody
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import java.util.function.Supplier

@Service
@Primary
class ScreenEngine(
    private val screenResponseCreator: ScreenResponseCreator
) {
    fun processScreen(
        request: ScreenRequest,
        screenGenerator: Supplier<ScreenResponse>
    ) : ScreenResponse {
        return screenResponseCreator.create(request, screenGenerator) { screenProcessHelper ->
            screenProcessHelper.
        }
    }
}