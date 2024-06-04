package com.example.kamilkh.backendserver.backendserver.engine

import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class ScreenResourceProcessor() {

    fun handleResources(
        request: ScreenRequest,
        response: ScreenResponse,
    ): ScreenProcessHelper {
        val screenProcessHelper = ScreenProcessHelper(request, response)
    }
}