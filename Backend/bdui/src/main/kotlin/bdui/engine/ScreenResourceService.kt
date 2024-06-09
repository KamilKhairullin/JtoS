package org.example.bdui.engine

import org.example.bdui.core.model.ScreenRequest
import org.example.bdui.core.model.ScreenResponse
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.example.bdui.core.abstract.AbstractAssembler
import org.example.bdui.core.abstract.AbstractSection

@Service
@Primary
class ScreenResourceService(
    private val resolverCaller: ScreenResolverCaller
) {
    fun get(
        request: ScreenRequest
    ): ScreenResponse {
        val screenTemplate = request.buildScreenTemplate()
        runBlocking {
            screenTemplate.sections.map { section ->
                async {
                    section.resolverRespone = resolverCaller.callResolver(section.resolver)
                    // val assembler = findAssembler(section)
                    // assembler.convert()
                }
            }
        }
        return ScreenResponse()
    }

    @Throws(IllegalArgumentException::class)
    private fun findAssembler(section: AbstractSection): AbstractAssembler {
        // return assemblersMap[section.assemblerType] ?:
        throw IllegalArgumentException("Assembler for section ${section.assemblerType} not found")
    }
}