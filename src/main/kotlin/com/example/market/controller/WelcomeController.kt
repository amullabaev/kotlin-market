package com.example.market.controller

import com.example.market.properties.CustomProperties
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController(private val properties: CustomProperties) {

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("firstName", properties.firstName)
        model.addAttribute("lastName", properties.lastName)
        return "welcome"
    }
}
