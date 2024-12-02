package com.es.jwtSecurityKotlin.service

import com.nimbusds.jwt.JWTClaimsSet
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import java.time.Instant
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.*
import java.util.stream.Collectors

class TokenService {
    fun generarToken(authentication: Authentication){

        val roles :String = authentication
            .authorities
            .map { it.authority }
            .joinToString(" ") // Contiene los roles del usuario

        val payload: JWTClaimsSet = JWTClaimsSet.Builder()
            .issuer("self")
            .issueTime(Date())
            .expirationTime(Date.from(Instant.now().plus(1,ChronoUnit.HOURS)))
            .subject(authentication.name)
            .claim("roles",roles)
            .build()
    }
}