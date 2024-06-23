package com.bdui.server.screenLogic.sections.test.renderer

import com.bdui.server.jto.View
import com.bdui.server.jto.image
import com.bdui.server.jto.model.Url
import com.bdui.server.jto.model.fit
import com.bdui.server.jto.model.insets.edgeInsets
import com.bdui.server.jto.model.size.fixedSize
import com.bdui.server.jto.singleState
import com.bdui.server.jto.ui
import com.bdui.server.jto.view
import com.bdui.server.screenLogic.sections.test.context.TestRenderContext
import java.util.UUID

object TestRenderer {

    fun render(renderContext: TestRenderContext): View {
        return ui {
            view(
                id = "snippet-id-${UUID.randomUUID()}",
                states = singleState(
                    div = image(
                        imageUrl = Url(""),
                        contentMode = fit,
                        width = fixedSize(50),
                        height = fixedSize(50),
                        edgeInsets = edgeInsets(left = 10, right = 10, top = 50, bottom = 50)
                    )
                )
            )
        }
    }
}