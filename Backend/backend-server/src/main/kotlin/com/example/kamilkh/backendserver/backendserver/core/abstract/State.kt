package com.example.kamilkh.backendserver.backendserver.core.abstract

abstract class State {
    lateinit var stateId: String
    var view: View? = null
}
