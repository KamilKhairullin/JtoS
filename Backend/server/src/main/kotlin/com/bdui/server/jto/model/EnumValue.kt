package com.bdui.server.jto.model

import com.fasterxml.jackson.annotation.JsonValue

sealed class EnumValue (
    @JsonValue
    val serialized: String,
)