package com.bdui.server.screenLogic.sections.test.renderer

import color
import com.bdui.server.jto.View
import com.bdui.server.jto.container
import com.bdui.server.jto.image
import com.bdui.server.jto.model.Url
import com.bdui.server.jto.model.fill
import com.bdui.server.jto.model.horizontal
import com.bdui.server.jto.model.insets.edgeInsets
import com.bdui.server.jto.model.size.fixedSize
import com.bdui.server.jto.model.size.matchParentSize
import com.bdui.server.jto.model.size.wrapContentSize
import com.bdui.server.jto.model.vertical
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
                        backgroundColor = color(Color.lightGray),
                        width = matchParentSize(),
                        height = fixedSize(50),
                        padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                        orientation = horizontal,
                        items = listOf(
                            container(
                                width = matchParentSize(),
                                height = fixedSize(50),
                                cornerRadius = 32,
                                padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                                orientation = horizontal,
                                items = listOf(
                                    image(
                                        imageUrl = Url("https://random-image-pepebigotes.vercel.app/api/random-image"),
                                        contentMode = fill,
                                        width = fixedSize(32),
                                        height = fixedSize(32),
                                        padding = edgeInsets(left = 20, right = 0, top = 0, bottom = 0)
                                    ),
                                    container(
                                        width = matchParentSize(),
                                        height = fixedSize(50),
                                        padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                                        orientation = vertical,
                                        items = listOf(
                                            text(
                                                text = "Доставка курьером",
                                                width = matchParentSize(),
                                                height = wrapContentSize(),
                                                fontSize = 12,
                                                padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                                            ),
                                            text(
                                                text = "Спортивная улица, 140",
                                                width = matchParentSize(),
                                                height = wrapContentSize(),
                                                fontSize = 12,
                                                padding = edgeInsets(left = 0, right = 0, top = 0, bottom = 0),
                                            )
                                        )
                                    )
                                )
                            )
                        ),
                    )
                )
            )
        }
    }
}
