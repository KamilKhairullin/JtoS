package org.example.bdui.engine

import org.springframework.web.servlet.resource.ResourceResolver

class SectionContentExtractor (
    val type: String,
    val assembler: String,
    val resolvers: List<ResourceResolver>
) {}