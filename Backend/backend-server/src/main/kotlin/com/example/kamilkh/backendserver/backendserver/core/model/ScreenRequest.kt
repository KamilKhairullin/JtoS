package com.example.kamilkh.backendserver.backendserver.core.model

import com.example.kamilkh.backendserver.backendserver.core.abstract.AbstractScreenBuilder

class ScreenRequest {
    var screenId: String? = null
    var screenBuilder: AbstractScreenBuilder? = null
}