package com.bdui.server.bdui.core.model

import com.bdui.server.bdui.core.abstract.AbstractSnippet
import com.bdui.server.jto.UiDto

class Snippet internal constructor(
    val id: String,
    val uiDto: UiDto
): AbstractSnippet() {}