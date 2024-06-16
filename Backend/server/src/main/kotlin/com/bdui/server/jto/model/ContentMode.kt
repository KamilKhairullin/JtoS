package com.bdui.server.jto.model

import com.bdui.server.jto.UiNamespace

sealed interface ContentMode

object FillEnumValue: EnumValue("fill"), ContentMode

val UiNamespace.fill: FillEnumValue
    get() = FillEnumValue
object FitEnumValue: EnumValue("fit"), ContentMode

val UiNamespace.fit: FitEnumValue
    get() = FitEnumValue
