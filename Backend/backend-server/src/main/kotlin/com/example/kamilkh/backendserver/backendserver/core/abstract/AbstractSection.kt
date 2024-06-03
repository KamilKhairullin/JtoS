package com.example.kamilkh.backendserver.backendserver.core.abstract

abstract class AbstractSection {
    lateinit var id: String
    var content: List<AbstractSnippet>? = null
}