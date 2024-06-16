package com.bdui.server.bdui.core.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.bdui.server.bdui.core.abstract.AbstractSection

@JsonInclude(JsonInclude.Include.NON_NULL)
class ScreenResponse(
    var ui: List<AbstractSection>?
) {
}