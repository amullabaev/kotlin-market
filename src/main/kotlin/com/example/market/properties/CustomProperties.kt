package com.example.market.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("custom-properties")
class CustomProperties {

    lateinit var firstName: String
    lateinit var lastName: String
}
