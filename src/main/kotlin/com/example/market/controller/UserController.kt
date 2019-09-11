package com.example.market.controller

import com.example.market.dto.UserDto
import com.example.market.entity.Role
import com.example.market.entity.User
import com.example.market.repository.RoleRepository
import com.example.market.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userRepository: UserRepository, private val roleRepository: RoleRepository) {

    @GetMapping
    fun findAll(): Iterable<User> {
        return userRepository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Optional<User> {
        return userRepository.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody userDto: UserDto): User {
        val role: Role = roleRepository.getOne(userDto.roleId)
        val user = User(
                firstName = userDto.firstName,
                lastName = userDto.lastName,
                email = userDto.email,
                role = role,
                rowCreatedDate = Date()
        )
        return userRepository.save(user)
    }

}
