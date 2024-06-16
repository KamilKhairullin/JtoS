package com.bdui.server.jto

class UiDto (
    var view: View
)

fun ui(init: UiNamespace.() -> View): UiDto {
    val namespace = UiNamespace()
    val view = init.invoke(namespace)
    return UiDto(view)
}