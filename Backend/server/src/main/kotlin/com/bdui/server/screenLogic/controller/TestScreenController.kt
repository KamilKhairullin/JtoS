package com.bdui.server.screenLogic.controller

import com.bdui.server.bdui.core.abstract.AbstractScreenController
import com.bdui.server.bdui.core.model.ScreenRequest
import com.bdui.server.bdui.core.model.ScreenResponse
import com.bdui.server.screenLogic.implementation.DefaultScreenProcessor
import com.bdui.server.screenLogic.screenBuilder.TestScreenBuilder
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class TestScreenController(
    private val screenProcessor: DefaultScreenProcessor
) : AbstractScreenController() {

    @GetMapping("/test")
    fun testScreen(): ScreenResponse {
        val request = ScreenRequest()
        request.screenBuilder = TestScreenBuilder()
        return screenProcessor.getScreen(request = request)
    }
}
