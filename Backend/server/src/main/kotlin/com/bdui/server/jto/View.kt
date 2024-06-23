package com.bdui.server.jto

import com.fasterxml.jackson.annotation.JsonUnwrapped

class View internal constructor(
    @JsonUnwrapped
    val properties: Properties
) {
    class Properties internal  constructor(
        val id: String?,
        val states: List<State>?
    )
    class State internal constructor(
        @JsonUnwrapped
        val properties: Properties
    ) {
        class Properties internal constructor(
            val stateId: Int,
            val div: Div
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