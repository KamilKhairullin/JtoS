package com.bdui.server.jto.model

import com.bdui.server.jto.UiNamespace

sealed interface Orientation

object HorizontalEnumValue: EnumValue("horizontal"), Orientation

val UiNamespace.horizontal: HorizontalEnumValue
    get() = HorizontalEnumValue
object VerticalEnumValue: EnumValue("vertical"), Orientation

val UiNamespace.vertical: VerticalEnumValue
    get() = VerticalEnumValue