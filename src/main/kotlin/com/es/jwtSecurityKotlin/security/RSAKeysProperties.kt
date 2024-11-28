package com.es.jwtSecurityKotlin.security

import org.springframework.boot.context.properties.ConfigurationProperties
import java.security.PrivateKey
import java.security.interfaces.RSAPublicKey

@ConfigurationProperties(prefix = "rsa")
data class RSAKeysProperties(
    var publicKey : RSAPublicKey,
    var privateKey: PrivateKey
)

