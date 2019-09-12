package com.example.market.service.impl

import com.example.market.entity.Role
import com.example.market.repository.RoleRepository
import com.example.market.service.RoleService
import org.springframework.stereotype.Service

@Service
class RoleServiceImpl(private val roleRepository: RoleRepository) : RoleService {
    override fun findAll(): Iterable<Role> {
        return roleRepository.findAll()
    }
}
