package org.example.bdui.engine

import org.example.bdui.core.abstract.AbstractAssembler
import java.util.stream.Collectors

class AssemblerContext(
    assemblers: List<AbstractAssembler>
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