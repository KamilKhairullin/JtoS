package com.bdui.server.bdui.core.abstract

import com.bdui.server.bdui.core.model.ScreenRequest
import com.bdui.server.bdui.core.model.ScreenResponse
import org.springframework.stereotype.Service

@Service
interface AbstractScreenProcessor {
    fun getScreen(request: ScreenRequest): ScreenResponse
}
