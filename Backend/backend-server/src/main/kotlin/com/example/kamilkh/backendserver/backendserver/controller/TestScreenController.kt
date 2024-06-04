package com.example.kamilkh.backendserver.backendserver.controller

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenController
import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenProcessor
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
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
