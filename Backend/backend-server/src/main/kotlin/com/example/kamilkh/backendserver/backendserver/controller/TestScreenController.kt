package com.example.kamilkh.backendserver.backendserver.controller

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenController
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenRequest
import com.example.kamilkh.backendserver.backendserver.core.abstract.ScreenResponse
import com.example.kamilkh.backendserver.backendserver.core.model.ScreenProcessor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestScreenController(
    private val screenProcessor: ScreenProcessor
) : AbstractScreenController() {

    @GetMapping("/test")
    fun testScreen(): ScreenResponse {
        return screenProcessor.getScreen(request = ScreenRequest())
    }
}
