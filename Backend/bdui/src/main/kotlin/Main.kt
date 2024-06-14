package org.example

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.engine.AssemblerContext
import org.example.bdui.engine.ScreenEngine
import org.example.bdui.engine.ScreenResolverCaller
import org.example.bdui.engine.ScreenResourceService
import org.example.bdui.engine.ScreenResponseCreator
import org.example.screenLogic.implementation.DefaultScreenProcessor
import org.example.screenLogic.screenBuilder.TestScreenBuilder
import org.example.screenLogic.sections.test.TestAssembler

fun main() {
    println("Test run started!")
    val request = ScreenRequest()
    request.screenBuilder = TestScreenBuilder()
    val resolverCaller = ScreenResolverCaller()
    val assemblers = listOf(TestAssembler())
    val assemblerContext = AssemblerContext(assemblers)
    val screenResourceService = ScreenResourceService(resolverCaller = resolverCaller, assemblerContext = assemblerContext)
    val screenResponseCreator = ScreenResponseCreator(screenResourceService = screenResourceService)
    val screenEngine = ScreenEngine(screenResponseCreator = screenResponseCreator)
    val screenProcessor = DefaultScreenProcessor(engine = screenEngine)
    val screen = screenProcessor.getScreen(request = request)
    print("finished")
}