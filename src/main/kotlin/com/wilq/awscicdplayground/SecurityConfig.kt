package com.wilq.awscicdplayground

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain


@EnableWebFluxSecurity
class SecurityConfig {

    @Bean
    fun securitygWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain? {
        return http.authorizeExchange()
                .pathMatchers("/login/oauth2/code/cognito").permitAll()
                .anyExchange().authenticated()
                .and().build()
    }
}