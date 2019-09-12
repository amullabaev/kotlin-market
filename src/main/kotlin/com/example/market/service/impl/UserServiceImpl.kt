package com.example.market.service.impl

import com.example.market.dto.UserDto
import com.example.market.entity.Role
import com.example.market.entity.User
import com.example.market.repository.RoleRepository
import com.example.market.repository.UserRepository
import com.example.market.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
        private val userRepository: UserRepository,
        private val roleRepository: RoleRepository) : UserService {

    override fun findAll(): Iterable<User> {
        return userRepository.findAll()
    }

    override fun findById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }

    override fun create(userDto: UserDto): User {
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
