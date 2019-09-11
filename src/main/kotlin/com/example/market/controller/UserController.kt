package com.example.market.controller

import com.example.market.dto.UserDto
import com.example.market.entity.User
import com.example.market.service.UserService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAll(): Iterable<User> {
        return userService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Optional<User> {
        return userService.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody userDto: UserDto): User {
        return userService.create(userDto)
    }

}
