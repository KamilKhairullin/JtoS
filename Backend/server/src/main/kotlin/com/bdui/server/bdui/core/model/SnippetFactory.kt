package com.bdui.server.bdui.core.model

import com.bdui.server.jto.UiDto

object SnippetFactory {

    fun createSnippet(id: Int, dto: UiDto): Snippet {
        return Snippet(
            id = "snippet-id-$id",
            uiDto = dto
        )
    }
}