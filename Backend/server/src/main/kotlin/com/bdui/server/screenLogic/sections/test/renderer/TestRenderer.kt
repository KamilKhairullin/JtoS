package com.bdui.server.screenLogic.sections.test.renderer

import color
import com.bdui.server.jto.View
import com.bdui.server.jto.container
import com.bdui.server.jto.image
import com.bdui.server.jto.model.Url
import com.bdui.server.jto.model.fill
import com.bdui.server.jto.model.fit
import com.bdui.server.jto.model.horizontal
import com.bdui.server.jto.model.insets.edgeInsets
import com.bdui.server.jto.model.size.fixedSize
import com.bdui.server.jto.model.size.matchParentSize
import com.bdui.server.jto.model.size.wrapContentSize
import com.bdui.server.jto.singleState
import com.bdui.server.jto.text
import com.bdui.server.jto.ui
import com.bdui.server.jto.view
import com.bdui.server.screenLogic.sections.test.context.TestRenderContext
import java.awt.Color
import java.util.UUID

object TestRenderer {

    fun render(renderContext: TestRenderContext): View {
        return ui {
            view(
                id = "snippet-id-${UUID.randomUUID()}",
                states = singleState(
                    div = container(
                        backgroundColor = color(Color.YELLOW),
                        width = fixedSize(300),
                        height = fixedSize(50),
                        padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                        orientation = horizontal,
                        items = listOf(
                            text(
                                text = "Перейти к оформлению",
                                width = fixedSize(200),
                                height = fixedSize(200),
                                padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                            )
                        ),
                        cornerRadius = 15
                    )
                    // div = image(
                    //     imageUrl = Url("https://random-image-pepebigotes.vercel.app/api/random-image"),
                    //     contentMode = fit,
                    //     width = fixedSize(200),
                    //     height = fixedSize(200),
                    //     padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0)
                    // )
                )
            )
        }
    }
}