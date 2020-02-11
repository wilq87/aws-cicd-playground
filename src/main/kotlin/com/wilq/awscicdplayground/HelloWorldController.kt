package com.wilq.awscicdplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.security.Principal


@RestController
class HelloWorldController {

    @GetMapping("/")
    fun greet(principal: Mono<Principal>): Mono<String> {
        return principal
                .map<String>(Principal::getName)
                .map { name: Any? -> String.format("Hello world to: %s", name) }
    }
}