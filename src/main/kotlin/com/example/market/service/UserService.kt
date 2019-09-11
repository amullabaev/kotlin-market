package com.example.market.service

import com.example.market.dto.UserDto
import com.example.market.entity.User
import java.util.*

interface UserService {
    fun findAll(): Iterable<User>
    fun findById(id: Long): Optional<User>
    fun create(userDto: UserDto): User
}
