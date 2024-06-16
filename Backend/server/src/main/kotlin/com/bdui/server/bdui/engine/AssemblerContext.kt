package com.bdui.server.bdui.engine

import com.bdui.server.bdui.core.abstract.AbstractAssembler
import com.bdui.server.screenLogic.sections.test.TestAssembler
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class AssemblerContext(
    assemblers: List<AbstractAssembler> = listOf(TestAssembler())
) {
    private val assemblersMap = assemblers.stream()
        .collect(
            Collectors.toMap(
                { it.getName() },
                { it },
                { x, _ -> x}
            )
        )

    fun get(name: String): AbstractAssembler? {
        return assemblersMap[name]
    }
}