package org.example.screenLogic.controller

import org.example.bdui.core.abstract.AbstractScreenController
import org.example.bdui.core.abstract.AbstractScreenProcessor
import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse
import org.example.screenLogic.screenBuilder.TestScreenBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestScreenController(
    private val screenProcessor: AbstractScreenProcessor
) : AbstractScreenController() {

    @GetMapping("/test")
    fun testScreen(): ScreenResponse {
        val request = ScreenRequest()
        request.screenBuilder = TestScreenBuilder()
        return screenProcessor.getScreen(request = request)
    }
}
