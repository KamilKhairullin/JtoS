package com.bdui.server.screenLogic.sections.test.renderer

import com.bdui.server.jto.UiDto
import com.bdui.server.jto.image
import com.bdui.server.jto.model.Url
import com.bdui.server.jto.model.fit
import com.bdui.server.jto.model.fixedSize
import com.bdui.server.jto.singleState
import com.bdui.server.jto.ui
import com.bdui.server.jto.view
import com.bdui.server.screenLogic.sections.test.context.TestRenderContext

object TestRenderer {

    fun render(renderContext: TestRenderContext): UiDto {
        return ui {
            view(
                id = "TestView",
                states = singleState(
                    element = image(
                        imageUrl = Url(""),
                        contentMode = fit,
                        width = fixedSize(50),
                        height = fixedSize(50)
                    )
                )
            )
        }
    }
}