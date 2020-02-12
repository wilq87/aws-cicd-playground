package com.wilq.awscicdplayground

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.security.Principal


@RestController
class HelloWorldController {

    @GetMapping("/")
    fun home(): String {
        return "Hello stranger"
    }

    @GetMapping("/hello")
    fun greet(principal: Mono<Principal>): Mono<String> {
        return principal
                .map<String>(Principal::getName)
                .map { name: Any? -> String.format("Hello world to: %s", name) }
    }
}