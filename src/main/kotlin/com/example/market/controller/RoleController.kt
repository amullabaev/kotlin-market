package com.example.market.controller

import com.example.market.entity.Role
import com.example.market.service.RoleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/roles")
class RoleController(private val roleService: RoleService) {
    @GetMapping
    fun findAll(): Iterable<Role> {
        return roleService.findAll()
    }
}
