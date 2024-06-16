package com.bdui.server.bdui.engine

import com.bdui.server.bdui.core.model.ScreenRequest
import com.bdui.server.bdui.core.model.ScreenResponse
import com.bdui.server.bdui.core.model.ScreenTemplate
import com.bdui.server.bdui.engine.ScreenResourceService
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