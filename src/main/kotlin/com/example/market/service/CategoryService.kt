package com.example.market.service

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category

interface CategoryService {
    fun findAll(): Iterable<Category>
    fun findById(id: Long): Category?
    fun create(categoryDto: CategoryDto): Category
    fun update(id: Long, categoryDto: CategoryDto): Category
    fun destroy(id: Long)
}
