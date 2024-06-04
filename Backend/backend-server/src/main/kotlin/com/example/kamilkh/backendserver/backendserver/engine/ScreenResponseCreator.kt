package com.example.kamilkh.backendserver.backendserver.engine

import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequestBody
import org.springframework.stereotype.Service
import java.util.function.Supplier

@Service
class ScreenResponseCreator(
    private val screenResourceProcessor: ScreenResourceProcessor
) {
    fun create(
        request: ScreenRequest,
        screenGenerator: Supplier<ScreenResponse>,
        rawResponseModifier: ((ScreenProcessHelper) -> ScreenResponse)
    ): ScreenResponse {
        val rawResponse = getScreenTemplate(screenGenerator)
        val screenProcessHelper = screenResourceProcessor.handleResources(request, rawResponse)
        // fetch other backends data
        // preprocess response
        val response = rawResponseModifier.invoke(screenProcessHelper)
        // post process response
        return response
    }

    private fun getScreenTemplate(
        screenGenerator: Supplier<ScreenResponse>
    ): ScreenResponse {
        return screenGenerator.get()
    }
}