package com.example.market.service.impl

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category
import com.example.market.repository.CategoryRepository
import com.example.market.service.CategoryService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun findAll(): Iterable<Category> {
        return categoryRepository.findAll()
    }

    override fun findById(id: Long): Optional<Category> {
        return categoryRepository.findById(id)
    }

    override fun create(categoryDto: CategoryDto): Category {
        val category = Category(
                name = categoryDto.name,
                description = categoryDto.description,
                rowCreatedDate = Date()
        )
        return categoryRepository.save(category)
    }
}
