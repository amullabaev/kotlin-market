package com.example.market

import com.example.market.properties.CustomProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(CustomProperties::class)
class MarketApplication

fun main(args: Array<String>) {
    runApplication<MarketApplication>(*args)
}
