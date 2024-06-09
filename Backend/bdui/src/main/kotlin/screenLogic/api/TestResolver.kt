package org.example.screenLogic.api

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.example.bdui.core.resolver.Resolver
import org.springframework.web.client.RestTemplate

class TestResolver: Resolver() {
    override suspend fun resolve(): Deferred<Any?> = coroutineScope {
        async {
            val restTemplate = RestTemplate()
            val id = (0..826).random()
            val url = "https://rickandmortyapi.com/api/character/$id"
            val result = restTemplate.getForObject(url, Any::class.java)
            println(result)
            result
        }
    }
}