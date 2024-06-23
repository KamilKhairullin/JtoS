package com.bdui.server.jto

fun UiNamespace.singleState(div: Div): List<View.State> =
    View.State(
        View.State.Properties(
            stateId = 0,
            div = div
        )
    ).asList()

fun ui(init: UiNamespace.() -> View): View {
    val namespace = UiNamespace()
    val view = init.invoke(namespace)
    return view
}