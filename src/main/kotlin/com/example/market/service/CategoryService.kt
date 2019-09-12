package com.example.market.service

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category
import java.util.*

interface CategoryService {
    fun findAll(): Iterable<Category>
    fun findById(id: Long): Optional<Category>
    fun create(categoryDto: CategoryDto): Category
}
