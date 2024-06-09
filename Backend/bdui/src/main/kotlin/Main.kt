package org.example

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.engine.ScreenEngine
import org.example.bdui.engine.ScreenResolverCaller
import org.example.bdui.engine.ScreenResourceService
import org.example.bdui.engine.ScreenResponseCreator
import org.example.screenLogic.implementation.DefaultScreenProcessor
import org.example.screenLogic.screenBuilder.TestScreenBuilder

fun main() {
    println("Test run started!")
    val request = ScreenRequest()
    request.screenBuilder = TestScreenBuilder()
    val resolverCaller = ScreenResolverCaller()
    val screenResourceService = ScreenResourceService(resolverCaller = resolverCaller)
    val screenResponseCreator = ScreenResponseCreator(screenResourceService = screenResourceService)
    val screenEngine = ScreenEngine(screenResponseCreator = screenResponseCreator)
    val screenProcessor = DefaultScreenProcessor(engine = screenEngine)
    val screen = screenProcessor.getScreen(request = request)
    print("finished")
}