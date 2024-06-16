package com.bdui.server.jto

class View internal constructor(
    val properties: Properties
) {
    class Properties internal  constructor(
        val id: String?,
        val states: List<State>?
    )
    class State internal constructor(
        val properties: Properties
    ) {
        class Properties internal constructor(
            val stateId: Int,
            val element: UiElement
        ) {}
    }
}

fun UiNamespace.view(
    id: String,
    states: List<View.State>,
): View {
    return View(
        View.Properties(
            id = id,
            states = states
        )
    )
}

fun View.State.asList() = listOf(this)