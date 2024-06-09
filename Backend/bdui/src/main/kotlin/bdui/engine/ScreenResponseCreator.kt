package org.example.bdui.engine

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse
import org.example.bdui.core.model.ScreenTemplate
import org.springframework.stereotype.Service
import java.util.function.Supplier

@Service
class ScreenResponseCreator(
    private val screenResourceService: ScreenResourceService
) {
    fun create(
        request: ScreenRequest,
    ): ScreenResponse {
        // preprocess response
        // ...
        // call resolvers
        val response = screenResourceService.get(request)
        // post process response
        // ...
        return response
    }

    private fun getScreenTemplate(
        screenGenerator: Supplier<ScreenTemplate>
    ): ScreenTemplate {
        return screenGenerator.get()
    }
}