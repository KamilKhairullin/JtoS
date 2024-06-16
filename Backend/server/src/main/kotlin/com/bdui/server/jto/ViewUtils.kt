package com.bdui.server.jto

import com.bdui.server.jto.UiElement
import com.bdui.server.jto.UiNamespace
import com.bdui.server.jto.View
import com.bdui.server.jto.asList

fun UiNamespace.singleState(element: UiElement): List<View.State> =
    View.State(
        View.State.Properties(
            stateId = 0,
            element = element
        )
    ).asList()
