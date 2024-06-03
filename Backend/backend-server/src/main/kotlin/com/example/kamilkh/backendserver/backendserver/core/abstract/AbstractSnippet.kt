package com.example.kamilkh.backendserver.backendserver.core.abstract

abstract class AbstractSnippet {
    lateinit var id: String
    var states: List<State> = emptyList()
}
