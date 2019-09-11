package com.example.market.service

import com.example.market.entity.Role

interface RoleService {
    fun findAll(): Iterable<Role>
}
